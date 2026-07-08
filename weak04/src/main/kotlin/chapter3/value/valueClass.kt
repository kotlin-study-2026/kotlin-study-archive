package kos.chapter3.value

interface PrettyPrintable {
    fun pretty(): String
}

/**
 * 내부 값은 Long 하나뿐이다.
 *
 * 컴파일 타임:
 * - UserId는 Long과 다른 타입이다.
 *
 * 런타임:
 * - 가능하면 Long 하나로 표현된다.
 * - 하지만 nullable, generic, interface, Any로 다뤄지면 박싱될 수 있다.
 */
@JvmInline
value class UserId(val value: Long) : PrettyPrintable {
    init {
        require(value > 0) { "UserId는 양수여야 합니다." }
    }

    // value class는 추가 backing field를 가질 수 없다.
    // 따라서 이런 프로퍼티는 저장 필드가 아니라 계산 프로퍼티다.
    val storageKey: String
        get() = "user:$value"

    override fun pretty(): String = "User#$value"

    override fun toString(): String = "UserId($value)"
}

@JvmInline
value class FolderId(val value: Long) {
    init {
        require(value > 0) { "FolderId는 양수여야 합니다." }
    }

    override fun toString(): String = "FolderId($value)"
}

@JvmInline
value class LinkId(val value: Long) {
    init {
        require(value > 0) { "LinkId는 양수여야 합니다." }
    }

    override fun toString(): String = "LinkId($value)"
}

/**
 * 단위 의미를 타입으로 분리한 예시.
 *
 * 그냥 Int나 Long을 쓰면 200이 원인지, 엔인지, 센트인지 알 수 없다.
 */
@JvmInline
value class UsdCent(val cents: Long) {
    init {
        require(cents >= 0) { "금액은 음수일 수 없습니다." }
    }

    operator fun plus(other: UsdCent): UsdCent =
        UsdCent(this.cents + other.cents)

    fun format(): String {
        val dollars = cents / 100
        val centPart = (cents % 100).toString().padStart(2, '0')
        return "$$dollars.$centPart"
    }

    override fun toString(): String = "${cents}¢"
}

class Repository {
    fun findUser(id: UserId) {
        println("사용자 조회: ${id.value}")
    }

    fun openFolder(id: FolderId) {
        println("폴더 열기: ${id.value}")
    }

    fun moveLink(linkId: LinkId, targetFolderId: FolderId) {
        println("링크 이동: link=${linkId.value}, targetFolder=${targetFolderId.value}")
    }

    fun addExpense(expense: UsdCent) {
        println("지출 추가: ${expense.format()}")
    }
}

/**
 * 정확히 UserId 타입으로 받는다.
 *
 * 이런 경우 JVM에서는 가능한 한 UserId wrapper 객체를 만들지 않고
 * 내부 Long 값으로 처리할 수 있다.
 *
 * 단, 여기서 id.javaClass 같은 걸 찍으려고 하면
 * 그 관찰 자체가 boxing을 유발할 수 있으므로 하지 않는다.
 */
fun acceptExactUserId(id: UserId) {
    println("정확한 UserId로 받음: ${id.value}")
}

/**
 * UserId? 는 null을 표현해야 한다.
 *
 * Long primitive 하나만으로는 null을 표현할 수 없으므로
 * nullable value class는 boxed 표현이 필요할 수 있다.
 */
fun acceptNullableUserId(id: UserId?) {
    println("nullable UserId로 받음: value=$id, runtime=${runtimeTypeOf(id)}")
}

/**
 * generic T는 UserId 전용이 아니다.
 *
 * T 자리에는 UserId, String, Int, 다른 객체가 모두 들어올 수 있다.
 * JVM generic은 보통 Object 기반으로 동작하므로 value class가 boxed될 수 있다.
 */
fun <T> acceptGeneric(value: T): T {
    println("generic T로 받음: value=$value, runtime=${runtimeTypeOf(value)}")
    return value
}

/**
 * interface 타입으로 다루는 경우.
 *
 * UserId의 내부 값 Long 자체는 PrettyPrintable을 구현할 수 없다.
 * PrettyPrintable로 dispatch하려면 wrapper 객체가 필요할 수 있다.
 */
fun acceptPrettyPrintable(value: PrettyPrintable) {
    println("interface로 받음: ${value.pretty()}, runtime=${runtimeTypeOf(value)}")
}

/**
 * Any는 Kotlin의 최상위 타입이고 JVM에서는 Object에 가깝다.
 *
 * UserId(10), FolderId(10), 그냥 Long(10)은 내부 값이 모두 비슷해 보여도
 * Any로 들어간 뒤에는 런타임에서 타입을 구분할 수 있어야 한다.
 * 그래서 boxed 표현이 필요할 수 있다.
 */
fun acceptAny(value: Any) {
    println("Any로 받음: value=$value, runtime=${runtimeTypeOf(value)}")
}

fun runtimeTypeOf(value: Any?): String =
    value?.javaClass?.name ?: "null"

fun main() {
    val repository = Repository()

    val userId = UserId(1001L)
    val folderId = FolderId(2001L)
    val linkId = LinkId(3001L)

    repository.findUser(userId)
    repository.openFolder(folderId)
    repository.moveLink(linkId, folderId)

    // 내부 값은 모두 Long이지만 타입이 다르기 때문에 섞을 수 없다.
    // 아래 코드는 컴파일 오류다.

    // repository.findUser(folderId)
    // 오류: Required: UserId, Found: FolderId

    // repository.openFolder(userId)
    // 오류: Required: FolderId, Found: UserId

    // repository.moveLink(folderId, linkId)
    // 오류: Required: LinkId, FolderId 순서인데 반대로 넣음

    val lunch = UsdCent(1_470L)
    val coffee = UsdCent(450L)
    val total = lunch + coffee

    repository.addExpense(total)

    // repository.addExpense(200)
    // 오류: Required: UsdCent, Found: Int

    println(userId.storageKey)

    println("---- boxing이 생길 수 있는 상황 ----")

    acceptExactUserId(userId)

    acceptNullableUserId(userId)
    acceptNullableUserId(null)

    acceptGeneric(userId)

    acceptPrettyPrintable(userId)

    acceptAny(userId)
    acceptAny(folderId)
    acceptAny(10L)
}
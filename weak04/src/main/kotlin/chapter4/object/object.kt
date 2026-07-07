package kos.chapter4.`object`

object Payroll {
    val allEmployees = arrayListOf<String>()

    fun calculateSalary() {
        for (person in allEmployees) {
            /* ... */
        }
    }
}

private fun main(){
    Payroll./*INSTANCE.*/calculateSalary()
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "ko_s"
include("week_01")
include("week01")
include("week_01")
include("week01")
include("week02")
include("week02:kmt")
findProject(":week02:kmt")?.name = "kmt"
include("week02:kmt")
findProject(":week02:kmt")?.name = "kmt"

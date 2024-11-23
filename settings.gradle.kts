pluginManagement {

}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
    }
}


rootProject.name = "ktor-sample"
include(":embedded-server")
include(":engine-server")
include(":engine-server-yaml")
include(":server")
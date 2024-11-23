## Development mode (1/4)

# 1.application.conf
ktor { development = true }

# 2.application.yaml
ktor:
development: true

# 3.System property
-Dio.ktor.development=true

# 4.Gradle
application { applicationDefaultJvmArgs = listOf("-Dio.ktor.development=true") }
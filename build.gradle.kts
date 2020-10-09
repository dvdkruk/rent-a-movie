plugins {
    id("org.jetbrains.kotlin.jvm") version "1.3.72" apply false
}

allprojects {
    repositories {
        jcenter()
    }
}

subprojects {
    group = "movie.rental"
    version = "1.0"

    apply(plugin = "org.jetbrains.kotlin.jvm")
}

plugins {
  id("org.jetbrains.kotlin.js") version "1.3.61"
}

kotlin {
  target {
    useCommonJs()
    nodejs()
    browser {

    }
  }

  sourceSets.main {
    dependencies {
      implementation(npm("left-pad"))
    }
  }
}

repositories {
  mavenCentral()
}
dependencies {
  implementation(kotlin("stdlib-js"))
}

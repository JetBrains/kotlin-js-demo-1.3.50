plugins {
  id("org.jetbrains.kotlin.js") version "1.3.61"
}

repositories {
  mavenCentral()
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
      implementation(kotlin("stdlib-js"))
      implementation(npm("left-pad"))
    }
  }
}

plugins {
  kotlin("js") version "1.3.50"
}

kotlin {
  target {
    useCommonJs()
    nodejs()
  }

  sourceSets["main"].dependencies {
    implementation(kotlin("stdlib-js"))

    implementation(npm("left-pad", "1.3.0"))
  }
}

repositories {
  mavenCentral()
}

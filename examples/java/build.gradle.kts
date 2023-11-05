plugins {
    java
}

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation(project.rootProject) // <- On your project, use: implementation("io.github.g0dkar:qrcode-kotlin:4.0.0")
    implementation("org.jfree:org.jfree.svg:5.0.5")
}

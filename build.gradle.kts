plugins {
    kotlin("jvm") version "1.9.23"
    application
}

group = "com.desde0"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}

application {
    mainClass.set("MainKt")
}

// Habilita la entrada estándar (teclado) en la tarea 'run'.
// Es indispensable para que aplicaciones interactivas CLI puedan leer datos
// desde la terminal mediante readlnOrNull() sin provocar un cierre prematuro del flujo (EOF).
tasks.named<JavaExec>("run") {
    standardInput = System.`in`
}

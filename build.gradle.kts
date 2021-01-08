import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.4.1"
	id("io.spring.dependency-management") version "1.0.10.RELEASE"
	kotlin("jvm") version "1.4.21"
	kotlin("plugin.spring") version "1.4.21"
	`maven-publish`
}

group = "com.simonjamesrowe"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	maven { url = uri("https://nexus-jx.simonjamesrowe.com/repository/maven-group/") }
	mavenCentral()
}

dependencies {
	api("org.springframework.boot:spring-boot-starter-json")
	api("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.getByName<Jar>("jar") {
	enabled = true
}

tasks.getByName<Jar>("bootJar") {
	enabled = false
}

publishing {
	publications {
		create<MavenPublication>("maven") {
			from(components["java"])
		}
	}
}

import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.5.8"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	id("org.sonarqube") version "3.1.1"
	id("jacoco")
	kotlin("jvm") version "1.5.32"
	kotlin("plugin.spring") version "1.5.32"
	`maven-publish`
}

group = "com.simonjamesrowe"
val gradlePropertiesProp = project.properties
java.sourceCompatibility = JavaVersion.VERSION_11

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "11"
	}
}

repositories {
	maven { url = uri("https://nexus.simonjamesrowe.com/repository/maven-group/") }
	mavenCentral()
}

dependencies {
	api("org.springframework.boot:spring-boot-starter-json")
	api("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.springframework.kafka:spring-kafka")
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

tasks.withType<Test> {
	useJUnitPlatform()
	finalizedBy(tasks.jacocoTestReport)
}

tasks.jacocoTestReport {
	dependsOn(tasks.test)
	reports {
		xml.isEnabled = true
	}
}

sonarqube {
	properties {
		property("sonar.coverage.jacoco.xmlReportPaths", "$buildDir/reports/jacoco/test/jacocoTestReport.xml")
		property("sonar.host.url", gradlePropertiesProp["sonar.host.url"] ?: "")
		property("sonar.login", gradlePropertiesProp["sonar.login"] ?: "")
	}
}

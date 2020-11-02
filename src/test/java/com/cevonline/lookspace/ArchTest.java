package com.cevonline.lookspace;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {
        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("com.cevonline.lookspace");

        noClasses()
            .that()
            .resideInAnyPackage("com.cevonline.lookspace.service..")
            .or()
            .resideInAnyPackage("com.cevonline.lookspace.repository..")
            .should()
            .dependOnClassesThat()
            .resideInAnyPackage("..com.cevonline.lookspace.web..")
            .because("Services and repositories should not depend on web layer")
            .check(importedClasses);
    }
}

import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import './vendor';
import { BackendLookSpaceSharedModule } from 'app/shared/shared.module';
import { BackendLookSpaceCoreModule } from 'app/core/core.module';
import { BackendLookSpaceAppRoutingModule } from './app-routing.module';
import { BackendLookSpaceHomeModule } from './home/home.module';
import { BackendLookSpaceEntityModule } from './entities/entity.module';
// jhipster-needle-angular-add-module-import JHipster will add new module here
import { MainComponent } from './layouts/main/main.component';
import { NavbarComponent } from './layouts/navbar/navbar.component';
import { FooterComponent } from './layouts/footer/footer.component';
import { PageRibbonComponent } from './layouts/profiles/page-ribbon.component';
import { ErrorComponent } from './layouts/error/error.component';

@NgModule({
  imports: [
    BrowserModule,
    BackendLookSpaceSharedModule,
    BackendLookSpaceCoreModule,
    BackendLookSpaceHomeModule,
    // jhipster-needle-angular-add-module JHipster will add new module here
    BackendLookSpaceEntityModule,
    BackendLookSpaceAppRoutingModule,
  ],
  declarations: [MainComponent, NavbarComponent, ErrorComponent, PageRibbonComponent, FooterComponent],
  bootstrap: [MainComponent],
})
export class BackendLookSpaceAppModule {}

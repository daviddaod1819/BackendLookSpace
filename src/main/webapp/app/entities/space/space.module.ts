import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { BackendLookSpaceSharedModule } from 'app/shared/shared.module';
import { SpaceComponent } from './space.component';
import { SpaceDetailComponent } from './space-detail.component';
import { SpaceUpdateComponent } from './space-update.component';
import { SpaceDeleteDialogComponent } from './space-delete-dialog.component';
import { spaceRoute } from './space.route';

@NgModule({
  imports: [BackendLookSpaceSharedModule, RouterModule.forChild(spaceRoute)],
  declarations: [SpaceComponent, SpaceDetailComponent, SpaceUpdateComponent, SpaceDeleteDialogComponent],
  entryComponents: [SpaceDeleteDialogComponent],
})
export class BackendLookSpaceSpaceModule {}

import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
  imports: [
    RouterModule.forChild([
      {
        path: 'space',
        loadChildren: () => import('./space/space.module').then(m => m.BackendLookSpaceSpaceModule),
      },
      /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
    ]),
  ],
})
export class BackendLookSpaceEntityModule {}

import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListaUsuariosComponent } from './lista-usuarios/lista-usuarios.component';


const routes: Routes = [
    {
      path: '',
      component: ListaUsuariosComponent,
    },
    {
      path: '**',
      pathMatch: 'full',
      redirectTo: ''
    }
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule],
})

export class AppRoutingModule {}
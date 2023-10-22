import { Component, OnInit } from '@angular/core';
import { Usuarios } from '../usuarios';
import { RestService } from '../rest.service';

@Component({
  selector: 'app-lista-usuarios',
  templateUrl: './lista-usuarios.component.html',
  styleUrls: ['./lista-usuarios.component.css']
})
export class ListaUsuariosComponent implements OnInit {

  usuarios: Usuarios[] = [];

  constructor(private resService: RestService){}

  ngOnInit(): void {
    this.obtenerUsuarios();
  }

  private obtenerUsuarios(){
    this.resService.traerDatos().subscribe(dato => {
      this.usuarios = dato;
    })
  }

}

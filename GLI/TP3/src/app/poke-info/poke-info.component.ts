import {Component, Input, OnInit} from '@angular/core';
import {PokeApiService} from "../service/poke-api.service";
import {Pokemon} from "../model/pokemon/pokemon";

@Component({
  selector: 'app-poke-info',
  templateUrl: './poke-info.component.html',
  styleUrls: ['./poke-info.component.css']
})
export class PokeInfoComponent implements OnInit {

  pokemon: Pokemon;

  _id: number;

  private pokeApiService: PokeApiService;

  constructor(pokeApiService: PokeApiService) {
    this.pokeApiService = pokeApiService;
    pokeApiService.getPokemon(1).subscribe((pokemon: Pokemon) => {
      this.pokemon = pokemon;
    });
  }

  @Input()
  set id(id: number) {
    this._id = id;
    this.pokeApiService.getPokemon(id).subscribe((pokemon: Pokemon) => {
      this.pokemon = pokemon;
    });
  }

  get id() {
    return this._id
  }

  ngOnInit() {
  }

}

import {Component, OnInit} from '@angular/core';
import {PokeApiService} from "../service/poke-api.service";
import {Pokemon} from "../model/pokemon";
import {PokemonsResponse} from "../model/pokemons-response";

@Component({
  selector: 'app-poke-search',
  templateUrl: './poke-search.component.html',
  styleUrls: ['./poke-search.component.css']
})
export class PokeSearchComponent implements OnInit {

  id: string = '';
  pokemons: Array<Pokemon> = [];
  selectedPoke: Pokemon = null;
  pokeFilter: string = '';

  constructor(pokeApiService: PokeApiService) {
    pokeApiService.getPokemons().subscribe((data: PokemonsResponse) => {
      this.pokemons = data.pokemon_entries;
    });
  }

  ngOnInit() {
  }

  pushOk() {
    console.log(this.id);
  }

}

import {Component, OnInit} from '@angular/core';
import {PokeApiService} from "../service/poke-api.service";
import {Pokemons} from "../model/pokemons/pokemons";
import {PokemonsResponse} from "../model/pokemons/pokemons-response";

@Component({
  selector: 'app-poke-search',
  templateUrl: './poke-search.component.html',
  styleUrls: ['./poke-search.component.css']
})
export class PokeSearchComponent implements OnInit {

  id: number = 1;
  pokemons: Array<Pokemons> = [];
  selectedPoke: number = 1;
  pokeFilter: string = '';

  constructor(pokeApiService: PokeApiService) {
    pokeApiService.getPokemons().subscribe((data: PokemonsResponse) => {
      this.pokemons = data.pokemon_entries;
    });
  }

  ngOnInit() {
  }

  pushOk() {
    this.id = this.selectedPoke;
  }

}

import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class PokeApiService {

  static readonly URL: string = "https://pokeapi.co/";
  static readonly POKEMONS: string = "api/v2/pokedex/1/";
  static readonly POKEMON: string = "api/v2/pokemon/";

  private httpClient: HttpClient = null;

  constructor(httpClient: HttpClient) {
    this.httpClient = httpClient;
  }

  getPokemons() {
    return this.httpClient.get(`${PokeApiService.URL}${PokeApiService.POKEMONS}`)
  }

  getPokemon(id: number) {
    return this.httpClient.get(`${PokeApiService.URL}${PokeApiService.POKEMON}${id}/`)
  }
}

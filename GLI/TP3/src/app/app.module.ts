import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {FormsModule} from '@angular/forms';

import {AppComponent} from './app.component';
import {PokeSearchComponent} from './poke-search/poke-search.component';
import {FilterPokemonPipePipe} from './filter/filter-pokemon--pipe.pipe';
import {PokeApiService} from "./service/poke-api.service";
import {HttpClientModule} from "@angular/common/http";
import { PokeInfoComponent } from './poke-info/poke-info.component';

@NgModule({
  declarations: [
    AppComponent,
    PokeSearchComponent,
    FilterPokemonPipePipe,
    PokeInfoComponent
  ],
  imports: [
    FormsModule,
    BrowserModule,
    HttpClientModule
  ],
  providers: [PokeApiService],
  bootstrap: [AppComponent]
})
export class AppModule {
}

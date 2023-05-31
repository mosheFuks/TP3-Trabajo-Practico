package com.example.trabajopractico

import org.json.JSONArray
import org.json.JSONObject

class CarListGenerator {
    companion object {
        fun createCarListJson(): JSONArray? {
            val carList = """
               [
  {
    "slug": "abbott-detroit",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/abbott-detroit.png"
  },
  {
    "slug": "abt",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/abt.png"
  },
  {
    "slug": "ac",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/ac.png"
  },
  {
    "slug": "abarth",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/abarth.png"
  },
  {
    "slug": "abadal",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/abadal.png"
  },
  {
    "slug": "acura",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/acura.png"
  },
  {
    "slug": "aixam",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/aixam.png"
  },
  {
    "slug": "alpine",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/alpine.png"
  },
  {
    "slug": "alpina",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/alpina.png"
  },
  {
    "slug": "alfa romeo",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/alfa-romeo.png"
  },
  {
    "slug": "alta",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/alta.png"
  },
  {
    "slug": "alvis",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/alvis.png"
  },
  {
    "slug": "amc",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/amc.png"
  },
  {
    "slug": "apollo",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/apollo.png"
  },
  {
    "slug": "arcfox",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/arcfox.png"
  },
  {
    "slug": "arash",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/arash.png"
  },
  {
    "slug": "aro",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/aro.png"
  },
  {
    "slug": "ariel",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/ariel.png"
  },
  {
    "slug": "arrival",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/arrival.png"
  },
  {
    "slug": "arrinera",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/arrinera.png"
  },
  {
    "slug": "ascari",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/ascari.png"
  },
  {
    "slug": "artega",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/artega.png"
  },
  {
    "slug": "askam",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/askam.png"
  },
  {
    "slug": "aspark",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/aspark.png"
  },
  {
    "slug": "aston-martin",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/aston-martin.png"
  },
  {
    "slug": "atalanta",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/atalanta.png"
  },
  {
    "slug": "auburn",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/auburn.png"
  },
  {
    "slug": "audi-sport",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/audi-sport.png"
  },
  {
    "slug": "audi",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/audi.png"
  },
  {
    "slug": "austin",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/austin.png"
  },
  {
    "slug": "autobianchi",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/autobianchi.png"
  },
  {
    "slug": "autobacs",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/autobacs.png"
  },
  {
    "slug": "bac",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/bac.png"
  },
  {
    "slug": "axon",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/axon.png"
  },
  {
    "slug": "baic-motor",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/baic-motor.png"
  },
  {
    "slug": "baojun",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/baojun.png"
  },
  {
    "slug": "beiben",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/beiben.png"
  },
  {
    "slug": "berkeley",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/berkeley.png"
  },
  {
    "slug": "bentley",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/bentley.png"
  },
  {
    "slug": "berliet",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/berliet.png"
  },
  {
    "slug": "bertone",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/bertone.png"
  },
  {
    "slug": "bitter",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/bitter.png"
  },
  {
    "slug": "bharatbenz",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/bharatbenz.png"
  },
  {
    "slug": "bestune",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/bestune.png"
  },
  {
    "slug": "bmw",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/bmw.png"
  },
  {
    "slug": "bmw-m",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/bmw-m.png"
  },
  {
    "slug": "bowler",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/bowler.png"
  },
  {
    "slug": "borgward",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/borgward.png"
  },
  {
    "slug": "bizzarrini",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/bizzarrini.png"
  },
  {
    "slug": "brabus",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/brabus.png"
  },
  {
    "slug": "brammo",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/brammo.png"
  },
  {
    "slug": "brooke",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/brooke.png"
  },
  {
    "slug": "brilliance",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/brilliance.png"
  },
  {
    "slug": "bristol",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/bristol.png"
  },
  {
    "slug": "bufori",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/bufori.png"
  },
  {
    "slug": "buick",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/buick.png"
  },
  {
    "slug": "bugatti",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/bugatti.png"
  },
  {
    "slug": "byton",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/byton.png"
  },
  {
    "slug": "byd",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/byd.png"
  },
  {
    "slug": "canoo",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/canoo.png"
  },
  {
    "slug": "cadillac",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/cadillac.png"
  },
  {
    "slug": "caparo",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/caparo.png"
  },
  {
    "slug": "carlsson",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/carlsson.png"
  },
  {
    "slug": "camc",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/camc.png"
  },
  {
    "slug": "changan",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/changan.png"
  },
  {
    "slug": "changfeng",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/changfeng.png"
  },
  {
    "slug": "chery",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/chery.png"
  },
  {
    "slug": "caterham",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/caterham.png"
  },
  {
    "slug": "chevrolet-corvette",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/chevrolet-corvette.png"
  },
  {
    "slug": "chevrolet",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/chevrolet.png"
  },
  {
    "slug": "chrysler",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/chrysler.png"
  },
  {
    "slug": "cisitalia",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/cisitalia.png"
  },
  {
    "slug": "cizeta",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/cizeta.png"
  },
  {
    "slug": "citroen",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/citroen.png"
  },
  {
    "slug": "cole",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/cole.png"
  },
  {
    "slug": "corre-la-licorne",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/corre-la-licorne.png"
  },
  {
    "slug": "daf",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/daf.png"
  },
  {
    "slug": "daewoo",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/daewoo.png"
  },
  {
    "slug": "dacia",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/dacia.png"
  },
  {
    "slug": "daimler",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/daimler.png"
  },
  {
    "slug": "daihatsu",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/daihatsu.png"
  },
  {
    "slug": "david-brown",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/david-brown.png"
  },
  {
    "slug": "datsun",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/datsun.png"
  },
  {
    "slug": "dartz",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/dartz.png"
  },
  {
    "slug": "de-tomaso",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/de-tomaso.png"
  },
  {
    "slug": "dayun",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/dayun.png"
  },
  {
    "slug": "delage",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/delage.png"
  },
  {
    "slug": "devel-sixteen",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/devel-sixteen.png"
  },
  {
    "slug": "detroit-electric",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/detroit-electric.png"
  },
  {
    "slug": "diatto",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/diatto.png"
  },
  {
    "slug": "dina",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/dina.png"
  },
  {
    "slug": "desoto",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/desoto.png"
  },
  {
    "slug": "dkw",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/dkw.png"
  },
  {
    "slug": "dodge",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/dodge.png"
  },
  {
    "slug": "dongfeng",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/dongfeng.png"
  },
  {
    "slug": "dodge-viper",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/dodge-viper.png"
  },
  {
    "slug": "drako",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/drako.png"
  },
  {
    "slug": "donkervoort",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/donkervoort.png"
  },
  {
    "slug": "ds",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/ds.png"
  },
  {
    "slug": "edag",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/edag.png"
  },
  {
    "slug": "eagle",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/eagle.png"
  },
  {
    "slug": "eicher",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/eicher.png"
  },
  {
    "slug": "edsel",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/edsel.png"
  },
  {
    "slug": "duesenberg",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/duesenberg.png"
  },
  {
    "slug": "elemental",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/elemental.png"
  },
  {
    "slug": "elfin",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/elfin.png"
  },
  {
    "slug": "elva",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/elva.png"
  },
  {
    "slug": "eterniti",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/eterniti.png"
  },
  {
    "slug": "erf",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/erf.png"
  },
  {
    "slug": "englon",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/englon.png"
  },
  {
    "slug": "exeed",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/exeed.png"
  },
  {
    "slug": "9ff",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/9ff.png"
  },
  {
    "slug": "faraday-future",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/faraday-future.png"
  },
  {
    "slug": "facel-vega",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/facel-vega.png"
  },
  {
    "slug": "faw-jiefang",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/faw-jiefang.png"
  },
  {
    "slug": "faw",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/faw.png"
  },
  {
    "slug": "ferrari",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/ferrari.png"
  },
  {
    "slug": "fioravanti",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/fioravanti.png"
  },
  {
    "slug": "fiat",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/fiat.png"
  },
  {
    "slug": "fisker",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/fisker.png"
  },
  {
    "slug": "force-motors",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/force-motors.png"
  },
  {
    "slug": "foden",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/foden.png"
  },
  {
    "slug": "foton",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/foton.png"
  },
  {
    "slug": "ford-mustang",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/ford-mustang.png"
  },
  {
    "slug": "ford",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/ford.png"
  },
  {
    "slug": "franklin",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/franklin.png"
  },
  {
    "slug": "fpv",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/fpv.png"
  },
  {
    "slug": "freightliner",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/freightliner.png"
  },
  {
    "slug": "fso",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/fso.png"
  },
  {
    "slug": "gardner-douglas",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/gardner-douglas.png"
  },
  {
    "slug": "gac-group",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/gac-group.png"
  },
  {
    "slug": "gaz",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/gaz.png"
  },
  {
    "slug": "geely",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/geely.png"
  },
  {
    "slug": "geo",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/geo.png"
  },
  {
    "slug": "genesis",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/genesis.png"
  },
  {
    "slug": "geometry",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/geometry.png"
  },
  {
    "slug": "gillet",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/gillet.png"
  },
  {
    "slug": "gilbern",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/gilbern.png"
  },
  {
    "slug": "gmc",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/gmc.png"
  },
  {
    "slug": "ginetta",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/ginetta.png"
  },
  {
    "slug": "gonow",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/gonow.png"
  },
  {
    "slug": "golden-dragon",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/golden-dragon.png"
  },
  {
    "slug": "grinnall",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/grinnall.png"
  },
  {
    "slug": "great-wall",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/great-wall.png"
  },
  {
    "slug": "general-motors",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/general-motors.png"
  },
  {
    "slug": "gumpert",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/gumpert.png"
  },
  {
    "slug": "hafei",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/hafei.png"
  },
  {
    "slug": "haval",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/haval.png"
  },
  {
    "slug": "haima",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/haima.png"
  },
  {
    "slug": "hawtai",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/hawtai.png"
  },
  {
    "slug": "hennessey",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/hennessey.png"
  },
  {
    "slug": "hillman",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/hillman.png"
  },
  {
    "slug": "higer",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/higer.png"
  },
  {
    "slug": "hino",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/hino.png"
  },
  {
    "slug": "hispano-suiza",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/hispano-suiza.png"
  },
  {
    "slug": "holden",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/holden.png"
  },
  {
    "slug": "hommell",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/hommell.png"
  },
  {
    "slug": "honda",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/honda.png"
  },
  {
    "slug": "hongyan",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/hongyan.png"
  },
  {
    "slug": "horch",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/horch.png"
  },
  {
    "slug": "hongqi",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/hongqi.png"
  },
  {
    "slug": "hsv",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/hsv.png"
  },
  {
    "slug": "hudson",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/hudson.png"
  },
  {
    "slug": "hummer",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/hummer.png"
  },
  {
    "slug": "hupmobile",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/hupmobile.png"
  },
  {
    "slug": "hyundai",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/hyundai.png"
  },
  {
    "slug": "ic-bus",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/ic-bus.png"
  },
  {
    "slug": "infiniti",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/infiniti.png"
  },
  {
    "slug": "intermeccanica",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/intermeccanica.png"
  },
  {
    "slug": "innocenti",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/innocenti.png"
  },
  {
    "slug": "ih",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/ih.png"
  },
  {
    "slug": "international",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/international.png"
  },
  {
    "slug": "ikco",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/ikco.png"
  },
  {
    "slug": "irizar",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/irizar.png"
  },
  {
    "slug": "isdera",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/isdera.png"
  },
  {
    "slug": "iso",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/iso.png"
  },
  {
    "slug": "isuzu",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/isuzu.png"
  },
  {
    "slug": "jac",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/jac.png"
  },
  {
    "slug": "jaguar",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/jaguar.png"
  },
  {
    "slug": "iveco",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/iveco.png"
  },
  {
    "slug": "jawa",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/jawa.png"
  },
  {
    "slug": "jba-motors",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/jba-motors.png"
  },
  {
    "slug": "jeep",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/jeep.png"
  },
  {
    "slug": "jetta",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/jetta.png"
  },
  {
    "slug": "jensen",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/jensen.png"
  },
  {
    "slug": "jmc",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/jmc.png"
  },
  {
    "slug": "kaiser",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/kaiser.png"
  },
  {
    "slug": "kamaz",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/kamaz.png"
  },
  {
    "slug": "karma",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/karma.png"
  },
  {
    "slug": "karlmann-king",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/karlmann-king.png"
  },
  {
    "slug": "keating",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/keating.png"
  },
  {
    "slug": "kenworth",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/kenworth.png"
  },
  {
    "slug": "king-long",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/king-long.png"
  },
  {
    "slug": "kia",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/kia.png"
  },
  {
    "slug": "koenigsegg",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/koenigsegg.png"
  },
  {
    "slug": "ktm",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/ktm.png"
  },
  {
    "slug": "lada",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/lada.png"
  },
  {
    "slug": "lagonda",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/lagonda.png"
  },
  {
    "slug": "lamborghini",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/lamborghini.png"
  },
  {
    "slug": "lancia",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/lancia.png"
  },
  {
    "slug": "land-rover",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/land-rover.png"
  },
  {
    "slug": "landwind",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/landwind.png"
  },
  {
    "slug": "laraki",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/laraki.png"
  },
  {
    "slug": "lexus",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/lexus.png"
  },
  {
    "slug": "li-auto",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/li-auto.png"
  },
  {
    "slug": "leyland",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/leyland.png"
  },
  {
    "slug": "lifan",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/lifan.png"
  },
  {
    "slug": "ligier",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/ligier.png"
  },
  {
    "slug": "lincoln",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/lincoln.png"
  },
  {
    "slug": "lister",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/lister.png"
  },
  {
    "slug": "lloyd",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/lloyd.png"
  },
  {
    "slug": "lobini",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/lobini.png"
  },
  {
    "slug": "levc",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/levc.png"
  },
  {
    "slug": "lordstown",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/lordstown.png"
  },
  {
    "slug": "lucid",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/lucid.png"
  },
  {
    "slug": "luxgen",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/luxgen.png"
  },
  {
    "slug": "lotus",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/lotus.png"
  },
  {
    "slug": "lynk-and-co",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/lynk-and-co.png"
  },
  {
    "slug": "mack",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/mack.png"
  },
  {
    "slug": "mahindra",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/mahindra.png"
  },
  {
    "slug": "mansory",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/mansory.png"
  },
  {
    "slug": "man",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/man.png"
  },
  {
    "slug": "marcos",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/marcos.png"
  },
  {
    "slug": "marlin",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/marlin.png"
  },
  {
    "slug": "maserati",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/maserati.png"
  },
  {
    "slug": "mastretta",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/mastretta.png"
  },
  {
    "slug": "maxus",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/maxus.png"
  },
  {
    "slug": "maybach",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/maybach.png"
  },
  {
    "slug": "maz",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/maz.png"
  },
  {
    "slug": "mazda",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/mazda.png"
  },
  {
    "slug": "mclaren",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/mclaren.png"
  },
  {
    "slug": "melkus",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/melkus.png"
  },
  {
    "slug": "mercedes-amg",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/mercedes-amg.png"
  },
  {
    "slug": "mazzanti",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/mazzanti.png"
  },
  {
    "slug": "mercedes-benz",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/mercedes-benz.png"
  },
  {
    "slug": "mercury",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/mercury.png"
  },
  {
    "slug": "mev",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/mev.png"
  },
  {
    "slug": "merkur",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/merkur.png"
  },
  {
    "slug": "mg",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/mg.png"
  },
  {
    "slug": "microcar",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/microcar.png"
  },
  {
    "slug": "mini",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/mini.png"
  },
  {
    "slug": "mitsubishi",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/mitsubishi.png"
  },
  {
    "slug": "mitsuoka",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/mitsuoka.png"
  },
  {
    "slug": "mk",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/mk.png"
  },
  {
    "slug": "morgan",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/morgan.png"
  },
  {
    "slug": "morris",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/morris.png"
  },
  {
    "slug": "mosler",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/mosler.png"
  },
  {
    "slug": "navistar",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/navistar.png"
  },
  {
    "slug": "nevs",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/nevs.png"
  },
  {
    "slug": "nio",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/nio.png"
  },
  {
    "slug": "nikola",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/nikola.png"
  },
  {
    "slug": "nissan-nismo",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/nissan-nismo.png"
  },
  {
    "slug": "nissan",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/nissan.png"
  },
  {
    "slug": "nissan-gt-r",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/nissan-gt-r.png"
  },
  {
    "slug": "oldsmobile",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/oldsmobile.png"
  },
  {
    "slug": "oltcit",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/oltcit.png"
  },
  {
    "slug": "noble",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/noble.png"
  },
  {
    "slug": "osca",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/osca.png"
  },
  {
    "slug": "opel",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/opel.png"
  },
  {
    "slug": "paccar",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/paccar.png"
  },
  {
    "slug": "pagani",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/pagani.png"
  },
  {
    "slug": "panhard",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/panhard.png"
  },
  {
    "slug": "panoz",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/panoz.png"
  },
  {
    "slug": "packard",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/packard.png"
  },
  {
    "slug": "pegaso",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/pegaso.png"
  },
  {
    "slug": "perodua",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/perodua.png"
  },
  {
    "slug": "peterbilt",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/peterbilt.png"
  },
  {
    "slug": "peugeot",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/peugeot.png"
  },
  {
    "slug": "pgo",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/pgo.png"
  },
  {
    "slug": "pierce-arrow",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/pierce-arrow.png"
  },
  {
    "slug": "pininfarina",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/pininfarina.png"
  },
  {
    "slug": "polestar",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/polestar.png"
  },
  {
    "slug": "plymouth",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/plymouth.png"
  },
  {
    "slug": "pontiac",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/pontiac.png"
  },
  {
    "slug": "porsche",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/porsche.png"
  },
  {
    "slug": "premier",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/premier.png"
  },
  {
    "slug": "praga",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/praga.png"
  },
  {
    "slug": "prodrive",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/prodrive.png"
  },
  {
    "slug": "proton",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/proton.png"
  },
  {
    "slug": "qoros",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/qoros.png"
  },
  {
    "slug": "radical",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/radical.png"
  },
  {
    "slug": "ram",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/ram.png"
  },
  {
    "slug": "rambler",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/rambler.png"
  },
  {
    "slug": "ranz",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/ranz.png"
  },
  {
    "slug": "renault",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/renault.png"
  },
  {
    "slug": "renault-samsung",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/renault-samsung.png"
  },
  {
    "slug": "rezvani",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/rezvani.png"
  },
  {
    "slug": "riley",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/riley.png"
  },
  {
    "slug": "rimac",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/rimac.png"
  },
  {
    "slug": "rinspeed",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/rinspeed.png"
  },
  {
    "slug": "rivian",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/rivian.png"
  },
  {
    "slug": "rolls-royce",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/rolls-royce.png"
  },
  {
    "slug": "roewe",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/roewe.png"
  },
  {
    "slug": "ronart",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/ronart.png"
  },
  {
    "slug": "rossion",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/rossion.png"
  },
  {
    "slug": "rover",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/rover.png"
  },
  {
    "slug": "ruf",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/ruf.png"
  },
  {
    "slug": "saab",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/saab.png"
  },
  {
    "slug": "saipa",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/saipa.png"
  },
  {
    "slug": "saic-motor",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/saic-motor.png"
  },
  {
    "slug": "saleen",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/saleen.png"
  },
  {
    "slug": "saturn",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/saturn.png"
  },
  {
    "slug": "scania",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/scania.png"
  },
  {
    "slug": "scion",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/scion.png"
  },
  {
    "slug": "seat",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/seat.png"
  },
  {
    "slug": "setra",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/setra.png"
  },
  {
    "slug": "shacman",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/shacman.png"
  },
  {
    "slug": "simca",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/simca.png"
  },
  {
    "slug": "singer",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/singer.png"
  },
  {
    "slug": "singulato",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/singulato.png"
  },
  {
    "slug": "sisu",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/sisu.png"
  },
  {
    "slug": "sinotruk",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/sinotruk.png"
  },
  {
    "slug": "skoda",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/skoda.png"
  },
  {
    "slug": "smart",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/smart.png"
  },
  {
    "slug": "soueast",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/soueast.png"
  },
  {
    "slug": "spania-gta",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/spania-gta.png"
  },
  {
    "slug": "spirra",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/spirra.png"
  },
  {
    "slug": "spyker",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/spyker.png"
  },
  {
    "slug": "ssangyong",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/ssangyong.png"
  },
  {
    "slug": "sterling",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/sterling.png"
  },
  {
    "slug": "ssc",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/ssc.png"
  },
  {
    "slug": "studebaker",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/studebaker.png"
  },
  {
    "slug": "subaru",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/subaru.png"
  },
  {
    "slug": "suzuki",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/suzuki.png"
  },
  {
    "slug": "suffolk",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/suffolk.png"
  },
  {
    "slug": "stutz",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/stutz.png"
  },
  {
    "slug": "talbot",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/talbot.png"
  },
  {
    "slug": "tata",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/tata.png"
  },
  {
    "slug": "tesla",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/tesla.png"
  },
  {
    "slug": "tatra",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/tatra.png"
  },
  {
    "slug": "techart",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/techart.png"
  },
  {
    "slug": "toyota-alphard",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/toyota-alphard.png"
  },
  {
    "slug": "toyota",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/toyota.png"
  },
  {
    "slug": "toyota-crown",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/toyota-crown.png"
  },
  {
    "slug": "tramontana",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/tramontana.png"
  },
  {
    "slug": "toyota-century",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/toyota-century.png"
  },
  {
    "slug": "trion",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/trion.png"
  },
  {
    "slug": "troller",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/troller.png"
  },
  {
    "slug": "triumph",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/triumph.png"
  },
  {
    "slug": "tvr",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/tvr.png"
  },
  {
    "slug": "uaz",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/uaz.png"
  },
  {
    "slug": "tucker",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/tucker.png"
  },
  {
    "slug": "ultima",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/ultima.png"
  },
  {
    "slug": "ud",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/ud.png"
  },
  {
    "slug": "vandenbrink",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/vandenbrink.png"
  },
  {
    "slug": "vauxhall",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/vauxhall.png"
  },
  {
    "slug": "vector",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/vector.png"
  },
  {
    "slug": "venturi",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/venturi.png"
  },
  {
    "slug": "vencer",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/vencer.png"
  },
  {
    "slug": "venucia",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/venucia.png"
  },
  {
    "slug": "volkswagen",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/volkswagen.png"
  },
  {
    "slug": "vinfast",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/vinfast.png"
  },
  {
    "slug": "volvo",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/volvo.png"
  },
  {
    "slug": "wanderer",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/wanderer.png"
  },
  {
    "slug": "w-motors",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/w-motors.png"
  },
  {
    "slug": "wartburg",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/wartburg.png"
  },
  {
    "slug": "weltmeister",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/weltmeister.png"
  },
  {
    "slug": "wey",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/wey.png"
  },
  {
    "slug": "western-star",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/western-star.png"
  },
  {
    "slug": "westfield",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/westfield.png"
  },
  {
    "slug": "willys-overland",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/willys-overland.png"
  },
  {
    "slug": "wiesmann",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/wiesmann.png"
  },
  {
    "slug": "workhorse",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/workhorse.png"
  },
  {
    "slug": "xpeng",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/xpeng.png"
  },
  {
    "slug": "wuling",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/wuling.png"
  },
  {
    "slug": "yulon",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/yulon.png"
  },
  {
    "slug": "zastava",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/zastava.png"
  },
  {
    "slug": "yutong",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/yutong.png"
  },
  {
    "slug": "zaz",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/zaz.png"
  },
  {
    "slug": "zenos",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/zenos.png"
  },
  {
    "slug": "zhongtong",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/zhongtong.png"
  },
  {
    "slug": "zenvo",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/zenvo.png"
  },
  {
    "slug": "zotye",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/zotye.png"
  },
  {
    "slug": "zinoro",
    "logo": "https://raw.githubusercontent.com/filippofilip95/car-logos-dataset/master/logos/optimized/zinoro.png"
  }
]
            """.trimIndent()

            val jsonArray = JSONArray(carList)
            var jsonObject: JSONObject? = null

            // Acceder a los elementos individuales del JSONArray
            for (i in 0 until jsonArray.length()) {
                jsonObject = jsonArray.getJSONObject(i)
                val slug: String = jsonObject.getString("slug")
                val logo: String = jsonObject.getString("logo")
                println("Slug: $slug, Logo: $logo")
            }

            return jsonArray
        }
    }
}

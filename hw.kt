class State(val name: String = "Belarus", val capital: City) {
    var regions: List<Region> = emptyList<Region>()
    fun addRegion(region: Region) {
        regions += region
    }

    fun printCapital() {
        println(capital.name)
    }

    fun printRegionsCount() {
        println(regions.count())
    }

    fun printSquare() {
        var square: Int = 0
        regions.forEach { region -> square += region.square }
        println(square)
    }

    fun printRegionsCapitals() {
        regions.forEach { region -> region.printCapital() }
    }
}

class Region(val name: String, val capital: City, val square: Int) {
    var districts: List<District> = emptyList<District>()
    fun addDistrict(district: District) {
        districts += district
    }

    fun printCapital() {
        println(capital.name)
    }
}

class District(val name: String) {
    var cities: List<City> = emptyList<City>()
    fun addCity(city: City) {
        cities += city
    }
}

class City(val name: String)

fun main() {
    val minsk = City("Minsk")
    val mogilev = City("Mogilev")
    val grodno = City("Grodno")
    val brest = City("Brest")
    val gomel = City("Gomel")
    val vitebsk = City("Vitebsk")

    val minDist = District("Minskij raion")
    val mogDist = District("Mogilevskij raion")
    val breDist = District("Brestskij raion")
    val groDist = District("Grodnenskij raion")
    val gomDist = District("Gomelskij raion")
    val vitDist = District("Vitebskij raion")

    minDist.addCity(minsk)
    mogDist.addCity(mogilev)
    breDist.addCity(brest)
    groDist.addCity(grodno)
    gomDist.addCity(gomel)
    vitDist.addCity(vitebsk)


    val minObl = Region("Minskaya obl", minsk, 7)
    val mogObl = Region("Mogilevskaya obl", mogilev, 6)
    val breObl = Region("Brestskaya obl", brest, 1)
    val groObl = Region("Grodnenskaya obl", grodno, 4)
    val gomObl = Region("Gomelskaya obl", gomel, 3)
    val vitObl = Region("Vitebskaya obl", vitebsk, 2)

    minObl.addDistrict(minDist)
    mogObl.addDistrict(mogDist)
    breObl.addDistrict(breDist)
    groObl.addDistrict(groDist)
    gomObl.addDistrict(gomDist)
    vitObl.addDistrict(vitDist)

    val belarus = State("Belarus", minsk)

    println("TEST 1 //////////////////////////////")

    belarus.addRegion(minObl)

    print("Столица: ")
    belarus.printCapital()
    print("Количество областей: ")
    belarus.printRegionsCount()
    print("Площадь: ")
    belarus.printSquare()
    print("Областные центры: ")
    belarus.printRegionsCapitals()

    println("TEST 2 //////////////////////////////")

    belarus.addRegion(mogObl)
    belarus.addRegion(breObl)
    belarus.addRegion(vitObl)
    belarus.addRegion(gomObl)
    belarus.addRegion(groObl)

    print("Столица: ")
    belarus.printCapital()
    print("Количество областей: ")
    belarus.printRegionsCount()
    print("Площадь: ")
    belarus.printSquare()
    println("Областные центры: ")
    belarus.printRegionsCapitals()
}

object PopulationProjection {
    @JvmStatic
    fun main(args: Array<String>) {
        val secondsInAYear = 60 * 60 * 24 * 365
        val birthsPerYear = secondsInAYear / 7
        val deathsPerYear = secondsInAYear / 13
        val newImmigrantPerYear = secondsInAYear / 45
        val currentPopulation = 312032486

        val populationIncreasePerYear = birthsPerYear + newImmigrantPerYear - deathsPerYear
        val populationAfterYear1 = currentPopulation + populationIncreasePerYear
        val populationAfterYear2 = populationAfterYear1 + populationIncreasePerYear
        val populationAfterYear3 = populationAfterYear2 + populationIncreasePerYear
        val populationAfterYear4 = populationAfterYear3 + populationIncreasePerYear
        val populationAfterYear5 = populationAfterYear4 + populationIncreasePerYear

        println("Population after the first year is: $populationAfterYear1")
        println("Population after the second year is: $populationAfterYear2")
        println("Population after the third year is: $populationAfterYear3")
        println("Population after the fourth year is: $populationAfterYear4")
        println("Population after the fifth year is: $populationAfterYear5")
    }
}

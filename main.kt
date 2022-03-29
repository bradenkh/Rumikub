fun main(args: Array<String>) {

}

data class Tile(private var color: String, private var number: String) {
    fun getColor(): String {
        return this.color;
    }
    fun getNumber() : String {
        return this.number
    }
}

class TileBag private constructor() {
    private var colors : List<String> = listOf("r","b","o","w");
    private var numbers : List<String> = listOf("1","2","3","4","5","6","7","8","9","10","11","12","13");
    private var wilds : List<String> = listOf("w","w");

    private var tiles : MutableList<Tile> = generateAllTiles();

    private fun generateAllTiles() : MutableList<Tile> {
        val myList : MutableList<Tile> = listOf<Tile>() as MutableList<Tile>;
        numbers.forEach { num ->
            colors.forEach { clr ->
                myList.add(Tile(clr, num));
            }
        }
        return myList;
    }

}

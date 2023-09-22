package enums

enum class PreciousMetal:IMetalPrice {
    RHODIUM{
        override fun price(): Int = 202220;
           },
    PLATINUM{
        override fun price(): Int = 31010;
            },
    GOLD{
        override fun price(): Int = 59040;
        },
    PALLADIUM{
        override fun price(): Int = 46440;
    }
}
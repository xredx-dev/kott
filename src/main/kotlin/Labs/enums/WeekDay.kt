package Labs.enums

enum class WeekDay : IDay {
    LUNES {
        override fun nextDay(): WeekDay = MARTES
    },
    MARTES {
        override fun nextDay(): WeekDay = MIÉRCOLES
    },
    MIÉRCOLES {
        override fun nextDay(): WeekDay = JUEVES
    },
    JUEVES {
        override fun nextDay(): WeekDay = VIERNES
    },
    VIERNES {
        override fun nextDay(): WeekDay = SÁBADO
    },
    SÁBADO {
        override fun nextDay(): WeekDay = DOMINGO
    },
    DOMINGO {
        override fun nextDay(): WeekDay = LUNES
    }
}

package dev.edgsel.ccredis_cli.resp

import dev.edgsel.ccredis_cli.resp.category.RespTypeCategory

enum class RespType(
    override val firstByte: String,
    override val category: RespTypeCategory
) : Resp {
    SIMPLE_STRING("+", RespTypeCategory.SIMPLE),
    SIMPLE_ERRORS("-", RespTypeCategory.SIMPLE),
    INTEGERS(":", RespTypeCategory.SIMPLE),
    BULK_STRINGS("$", RespTypeCategory.AGGREGATE),
    ARRAYS("*", RespTypeCategory.AGGREGATE),
    NULLS("_", RespTypeCategory.SIMPLE),
    BOOLEANS("#", RespTypeCategory.SIMPLE),
    DOUBLES(",", RespTypeCategory.SIMPLE),
    BIG_NUMBERS("(", RespTypeCategory.SIMPLE),
    BULK_ERRORS("!", RespTypeCategory.AGGREGATE),
    VERBATIM_STRINGS("=", RespTypeCategory.AGGREGATE),
    MAPS("%", RespTypeCategory.AGGREGATE),
    SETS("~", RespTypeCategory.AGGREGATE),
    PUSHES(">", RespTypeCategory.AGGREGATE),
}

fun RespType.getTypesByCategory(category: RespTypeCategory): List<RespType> {
    return RespType
        .entries
        .filter { it.category == category }
}

package dev.edgsel.ccredis_cli.resp

import dev.edgsel.ccredis_cli.resp.category.RespTypeCategory

enum class RespType(
    val firstByte: String,
    val category: RespTypeCategory
) {
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

fun findByFirstType(firstByte: String): RespType? {
    return RespType
        .entries
        .find { it.firstByte == firstByte }
}

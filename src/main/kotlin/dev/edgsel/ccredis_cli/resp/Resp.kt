package dev.edgsel.ccredis_cli.resp

import dev.edgsel.ccredis_cli.resp.category.RespTypeCategory

interface Resp {
    val firstByte: String
    val category: RespTypeCategory
}

package com.github.shiraji.foo

import com.amazonaws.services.lambda.runtime.Context

class FooHanlder {

    fun handler(count: Map<String, Object>, context: Context): String {
        val logger = context.logger
        logger.log("fooooooo: $count --- context: $context")
        return "context: $context"
    }
}
package com.github.shiraji.foo

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler

class FooHanlder : RequestHandler<FooHanlder.Request, FooHanlder.Response> {
    override fun handleRequest(input: Request?, context: Context?): Response {
        val logger = context?.logger ?: throw IllegalArgumentException()
        logger.log("input: $input")
        return Response(location = "https://github.com/shiraji/aws-lambda-kotlin-sample")
    }

    class Request

    data class Response(val location: String)
}
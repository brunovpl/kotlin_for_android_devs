package com.example.android.kotlinforandroiddevs.domain.commands

import com.example.android.kotlinforandroiddevs.data.ForecastRequest
import com.example.android.kotlinforandroiddevs.domain.mappers.ForecastMapper
import com.example.android.kotlinforandroiddevs.domain.model.ForecastList

class RequestForecastCommand(private val zipCode: String): Command<ForecastList> {
    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastMapper().convertFromDataModel(forecastRequest.execute())
    }
}
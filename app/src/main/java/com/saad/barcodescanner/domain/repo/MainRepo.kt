package com.saad.barcodescanner.domain.repo

import kotlinx.coroutines.flow.Flow

interface MainRepo {
    fun startScanning() : Flow<String?>
}
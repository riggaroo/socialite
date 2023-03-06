/*
 * Copyright (C) 2019 The Android Open Source Project
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.social.data

import android.net.Uri

data class Message(
    val id: Long,
    val sender: Long,
    val text: String,
    val photoUri: Uri?,
    val photoMimeType: String?,
    val timestamp: Long,
) {

    val isIncoming: Boolean
        get() = sender != 0L

    class Builder {
        var id: Long? = null
        var sender: Long? = null
        var text: String? = null
        var photo: Uri? = null
        var photoMimeType: String? = null
        var timestamp: Long? = null
        fun build() = Message(id!!, sender!!, text!!, photo, photoMimeType, timestamp!!)
    }
}

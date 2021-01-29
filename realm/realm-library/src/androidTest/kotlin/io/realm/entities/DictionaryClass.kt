/*
 * Copyright 2020 Realm Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.realm.entities

import io.realm.*
import org.bson.types.ObjectId
import java.util.*

open class DictionaryClass : RealmObject() {

    // TODO: ObjectId and other Java primitives
    var myDogDictionary: RealmDictionary<MyDog>? = null
    var myMixedDictionary: RealmDictionary<Mixed>? = null
    var myBooleanDictionary: RealmDictionary<Boolean>? = null
    var myStringDictionary: RealmDictionary<String>? = null
    var myIntegerDictionary: RealmDictionary<Int>? = null
    var myFloatDictionary: RealmDictionary<Float>? = null
    var myLongDictionary: RealmDictionary<Long>? = null
    var myShortDictionary: RealmDictionary<Short>? = null
    var myDoubleDictionary: RealmDictionary<Double>? = null
    var myByteDictionary: RealmDictionary<Byte>? = null
    var myByteArrayDictionary: RealmDictionary<ByteArray>? = null
    var myObjectIdDictionary: RealmDictionary<ObjectId>? = null
    var myUUIDDictionary: RealmDictionary<UUID>? = null

    // TODO: remove these, only used for inspiration for the proxy generator
//    var myByteList: RealmList<Byte>? = null
//    var myByteArrayList: RealmList<ByteArray>? = null

    companion object {
        const val CLASS_NAME = "DictionaryClass"
        const val REALM_MODEL_DICTIONARY_FIELD_NAME = "myDogDictionary"
        const val MIXED_DICTIONARY_FIELD_NAME = "myMixedDictionary"
        const val BOOLEAN_DICTIONARY_FIELD_NAME = "myBooleanDictionary"
        const val STRING_DICTIONARY_FIELD_NAME = "myStringDictionary"
        const val INTEGER_DICTIONARY_FIELD_NAME = "myIntegerDictionary"
        const val FLOAT_DICTIONARY_FIELD_NAME = "myFloatDictionary"
        const val LONG_DICTIONARY_FIELD_NAME = "myLongDictionary"
        const val SHORT_DICTIONARY_FIELD_NAME = "myShortDictionary"
        const val DOUBLE_DICTIONARY_FIELD_NAME = "myDoubleDictionary"
        const val BYTE_DICTIONARY_FIELD_NAME = "myByteDictionary"
        const val BYTE_ARRAY_DICTIONARY_FIELD_NAME = "myByteArrayDictionary"
        const val OBJECT_ID_DICTIONARY_FIELD_NAME = "myObjectIdDictionary"
        const val UUID_DICTIONARY_FIELD_NAME = "myUUIDDictionary"
    }
}

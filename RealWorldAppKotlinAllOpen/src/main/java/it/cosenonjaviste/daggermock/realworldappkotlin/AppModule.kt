/*
 *   Copyright 2016 Fabio Collini.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package it.cosenonjaviste.daggermock.realworldappkotlin

import dagger.Module
import dagger.Provides
import it.cosenonjaviste.daggermock.realworldappkotlin.services.RestService
import javax.inject.Singleton

@Module
@OpenForTesting
class AppModule(private val app: App) {

    @Provides
    @Singleton
    fun provideRestService(): RestService {
        return RestService(app)
    }
}

/*
 * Copyright 2020-2023 University of Oxford and NHS England
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package uk.ac.ox.softeng.maurodatamapper.plugins.forms.datatype

import uk.ac.ox.softeng.maurodatamapper.datamodel.item.datatype.DataTypeService
import uk.ac.ox.softeng.maurodatamapper.datamodel.item.datatype.PrimitiveType
import uk.ac.ox.softeng.maurodatamapper.datamodel.provider.DefaultDataTypeProvider
import uk.ac.ox.softeng.maurodatamapper.datamodel.rest.transport.DefaultDataType

import org.springframework.beans.factory.annotation.Autowired

class FormDataTypeProvider implements DefaultDataTypeProvider {

    @Autowired
    DataTypeService dataTypeService

    @Override
    String getDisplayName() {
        'Basic Form DataTypes'
    }

    @Override
    String getVersion() {
        '1.0.0'
    }

    @Override
    List<DefaultDataType> getDefaultListOfDataTypes() {
        dataTypeService.getDefaultListOfDataTypes() + [
            new PrimitiveType(label: 'URI', description: 'A URI'),
            new PrimitiveType(label: 'File', description: 'A file attachment')
        ].collect {new DefaultDataType(it)}
    }
}

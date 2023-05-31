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

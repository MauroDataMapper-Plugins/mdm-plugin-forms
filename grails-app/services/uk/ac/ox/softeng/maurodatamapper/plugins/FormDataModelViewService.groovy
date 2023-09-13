package uk.ac.ox.softeng.maurodatamapper.plugins

import uk.ac.ox.softeng.maurodatamapper.datamodel.DataModel
import uk.ac.ox.softeng.maurodatamapper.datamodel.DataModelService
import uk.ac.ox.softeng.maurodatamapper.datamodel.item.DataClass
import uk.ac.ox.softeng.maurodatamapper.datamodel.item.DataElement

class FormDataModelViewService {


    DataModelService dataModelService


    Map getFormModelAsMap(String dataModelId) {

        if(!dataModelId) {
            return [:]
        }

        if(dataModelId) {
            DataModel dataModel = DataModel.get(dataModelId)
            if(!dataModel) {
                return [:]
            }

            return [
                id: dataModel.id.toString(),
                label: dataModel.label,
                description: dataModel.description,
                dataClasses: dataModel.childDataClasses.collect{dataClassAsMap(it)}
            ]
        }
    }

    Map dataClassAsMap(DataClass dataClass) {
        return [
            id: dataClass.id.toString(),
            label: dataClass.label,
            description: dataClass.description,
            dataClasses: dataClass.dataClasses.collect{dataClassAsMap(it)},
            dataElements: dataClass.dataElements.collect{dataElementAsMap(it)},
        ]

    }

    Map dataElementAsMap(DataElement dataElement) {
        return [
            id: dataElement.id.toString(),
            label: dataElement.label,
            description: dataElement.description,
            dataType: dataElement.dataType.label
        ]

    }


}

package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.requests.backbone.interfaces;

import org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.models.BaseModel;

public interface CrudEndpointInterface {
	Object post(BaseModel model);
	Object get(long id);
	Object update(long id, BaseModel model);
	Object delete(long id);
}

package kodlamaio.hrms.core.utilities.adapters;


import kodlamaio.hrms.Services.FakeMernis;
import kodlamaio.hrms.core.utilities.result.ErrorResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.core.utilities.result.SuccessResult;

public class IdentityValidation {
	
	public static Result isRealPerson(String idNo) {
		
		if(FakeMernis.validate(idNo) == true) {
			return new SuccessResult();
		}
		return new ErrorResult("ID number is invalid");
	}
	

}

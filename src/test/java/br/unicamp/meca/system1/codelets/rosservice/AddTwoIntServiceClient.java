/**
 * 
 */
package br.unicamp.meca.system1.codelets.rosservice;

import java.net.URI;

import br.unicamp.cst.core.entities.Memory;
import br.unicamp.meca.system1.codelets.RosServiceClientMotorCodelet;
import rosjava_test_msgs.AddTwoIntsRequest;
import rosjava_test_msgs.AddTwoIntsResponse;

/**
 * @author andre
 *
 */
public class AddTwoIntServiceClient extends RosServiceClientMotorCodelet<AddTwoIntsRequest, AddTwoIntsResponse> {

	private Integer sum;
	
	public AddTwoIntServiceClient(String host, URI masterURI) {
		super("AddTwoIntServiceClient", "add_two_ints", rosjava_test_msgs.AddTwoInts._TYPE, host, masterURI);
	}

	@Override
	public void formatServiceRequest(Memory motorMemory, AddTwoIntsRequest serviceMessageRequest) {
		if(motorMemory != null && motorMemory.getI() != null) {
			Integer[] numsToSum = (Integer[]) motorMemory.getI();
			serviceMessageRequest.setA(numsToSum[0]);
			serviceMessageRequest.setB(numsToSum[1]);
		}
	}

	@Override
	public void processServiceResponse(AddTwoIntsResponse serviceMessageResponse) {
		sum = (int) serviceMessageResponse.getSum();
		System.out.println("Sum = "+sum);
	}
	
	/**
	 * @return the sum
	 */
	public Integer getSum() {
		return sum;
	}

}

package io.seldon.example.model;

import org.springframework.stereotype.Component;

import io.seldon.protos.PredictionProtos.DefaultData;
import io.seldon.protos.PredictionProtos.SeldonMessage;
import io.seldon.protos.PredictionProtos.Tensor;
import io.seldon.wrapper.api.SeldonPredictionService;

@Component
public class SeldonJavaDemoModelHandler implements SeldonPredictionService {

	@Override
	public SeldonMessage predict(SeldonMessage payload) {
		String s = payload.getStrData();
//              return SeldonMessage.newBuilder().setData(DefaultData.newBuilder().setTensor(Tensor.newBuilder().addShape(4).addValues(5.0))).build();
//              return SeldonMessage.newBuilder().setData(DefaultData.newBuilder().setNdarray(payload.getDataOrBuilder().getNdarray())).build();
		return SeldonMessage.newBuilder().setStrData(s).build();
	}

}

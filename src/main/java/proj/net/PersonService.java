package proj.net;


import io.grpc.stub.StreamObserver;
import proj.model.Msg;
import proj.model.Person;
import proj.model.PersonOrBuilder;
import proj.model.PersonServiceGrpc;

/**
 * Created by ve on 28.12.17.
 */
public class PersonService extends PersonServiceGrpc.PersonServiceImplBase{
    @Override
    public void hello(Msg request, StreamObserver<Person> responseObserver) {
        String msg = request.getMsg();

        responseObserver.onNext(Person.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<Msg> streamFeture(StreamObserver<Msg> responseObserver) {
        return super.streamFeture(responseObserver);
    }
}

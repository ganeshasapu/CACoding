package use_case.clear_users;

// TODO Complete me

import use_case.signup.SignupOutputBoundary;

public class ClearInteractor implements ClearInputBoundary {

    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary presenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessObject, ClearOutputBoundary presenter){
        this.userDataAccessObject = userDataAccessObject;
        this.presenter = presenter;
    }

    @Override
    public void execute() {
        userDataAccessObject.clearUsers();
    }
}

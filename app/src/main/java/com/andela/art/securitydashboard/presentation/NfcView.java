package com.andela.art.securitydashboard.presentation;


import com.andela.art.models.Asset;
import com.andela.art.root.View;

/**
 * Created by kalela on 20/11/18.
 */

public interface NfcView extends View {
    /**
     *
     * @param serial serial entered by dialog
     */
    void onConfirmClicked(String serial);

    /**
     *
     * @param asset asset that is passed from presenter
     */
    void sendIntent(Asset asset);

    /**
     * redirect user if they are logged out.
     */
    void redirectLoggedOutUser();

    /**
     *
     * @param email email
     * @param name name
     * @param photo photo
     */
    void setAccountDetails(String email, String name, String photo);

    /**
     *
     * @param error error
     */
    void displayErrorMessage(Throwable error);
}

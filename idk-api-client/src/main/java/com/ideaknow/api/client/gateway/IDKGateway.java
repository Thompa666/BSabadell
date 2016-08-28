package com.ideaknow.api.client.gateway;

import com.ideaknow.api.client.forms.DocumentForm;
import com.ideaknow.api.client.forms.accounts.AccountForm;
import com.ideaknow.api.client.forms.accounts.AccountMovementDocumentForm;
import com.ideaknow.api.client.forms.accounts.AccountMovementReturnBillForm;
import com.ideaknow.api.client.forms.accounts.AccountMovementsDebitSplitForm;
import com.ideaknow.api.client.forms.accounts.AccountMovementsForm;
import com.ideaknow.api.client.forms.accounts.AccountPayersForm;
import com.ideaknow.api.client.forms.accounts.AccountsForm;
import com.ideaknow.api.client.forms.accounts.transfers.TransferToCardForm;
import com.ideaknow.api.client.forms.agent.AgentForm;
import com.ideaknow.api.client.forms.agent.MyAvailabilityForm;
import com.ideaknow.api.client.forms.atmmobile.AtmMobileCommissionForm;
import com.ideaknow.api.client.forms.atmmobile.OtpGenerationForm;
import com.ideaknow.api.client.forms.atmmobile.OtpRemoveForm;
import com.ideaknow.api.client.forms.banner.BannerForm;
import com.ideaknow.api.client.forms.cards.CardActivationForm;
import com.ideaknow.api.client.forms.cards.CardBlockedForm;
import com.ideaknow.api.client.forms.cards.CardConditionsForm;
import com.ideaknow.api.client.forms.cards.CardConditionsUpdateForm;
import com.ideaknow.api.client.forms.cards.CardForm;
import com.ideaknow.api.client.forms.cards.CardLastMovementForm;
import com.ideaknow.api.client.forms.cards.CardLimitForm;
import com.ideaknow.api.client.forms.cards.CardMovementGeoPointForm;
import com.ideaknow.api.client.forms.cards.CardMovementsCreditSplitForm;
import com.ideaknow.api.client.forms.cards.CardMovementsCreditSplitPeriodsForm;
import com.ideaknow.api.client.forms.cards.CardMovementsDebitSplitForm;
import com.ideaknow.api.client.forms.cards.CardMovementsDebitSplitPeriodsForm;
import com.ideaknow.api.client.forms.cards.CardPDFConditionForm;
import com.ideaknow.api.client.forms.cards.CardPrepaidReloadCommissionsForm;
import com.ideaknow.api.client.forms.cards.CardPrepaidReloadForm;
import com.ideaknow.api.client.forms.cards.CardProfileForm;
import com.ideaknow.api.client.forms.cards.CardSecondKeyForm;
import com.ideaknow.api.client.forms.cards.CardSettlementDocForm;
import com.ideaknow.api.client.forms.cards.CardSettlementsForm;
import com.ideaknow.api.client.forms.cards.CardStickerForm;
import com.ideaknow.api.client.forms.cards.CardToAccountCommissionForm;
import com.ideaknow.api.client.forms.cards.CardToAccountTransferForm;
import com.ideaknow.api.client.forms.changepin.ChangePinForm;
import com.ideaknow.api.client.forms.checks.CheckForm;
import com.ideaknow.api.client.forms.checks.CheckInstantForm;
import com.ideaknow.api.client.forms.clicktocall.ClickToCallForm;
import com.ideaknow.api.client.forms.companies.CompanyForm;
import com.ideaknow.api.client.forms.companies.LimitAssignedForm;
import com.ideaknow.api.client.forms.companies.LimitForm;
import com.ideaknow.api.client.forms.contactdata.UpdateEmailForm;
import com.ideaknow.api.client.forms.directdebit.DirectDebitForm;
import com.ideaknow.api.client.forms.directdebit.DirectDebitListForm;
import com.ideaknow.api.client.forms.form.EnrollmentCreateForm;
import com.ideaknow.api.client.forms.form.EnrollmentListForm;
import com.ideaknow.api.client.forms.form.EnrollmentRemoveForm;
import com.ideaknow.api.client.forms.glass.SessionAccountMovementsForm;
import com.ideaknow.api.client.forms.glass.SessionAccountsForm;
import com.ideaknow.api.client.forms.inbox.InboxForm;
import com.ideaknow.api.client.forms.informational.InformationalForm;
import com.ideaknow.api.client.forms.instantmoney.InstantMoneyActivationForm;
import com.ideaknow.api.client.forms.instantmoney.InstantMoneyCommissionsForm;
import com.ideaknow.api.client.forms.instantmoney.InstantMoneyForm;
import com.ideaknow.api.client.forms.key.SecondKeyForm;
import com.ideaknow.api.client.forms.mail.MailDocumentForm;
import com.ideaknow.api.client.forms.mail.MailListForm;
import com.ideaknow.api.client.forms.mail.MailsForm;
import com.ideaknow.api.client.forms.menu.MenuForm;
import com.ideaknow.api.client.forms.nfc.NfcSessionForm;
import com.ideaknow.api.client.forms.nfc.NfcSignUpCardModel;
import com.ideaknow.api.client.forms.nfc.NfcSignUpUnsubscribeForm;
import com.ideaknow.api.client.forms.nosessioninbox.NoSessionInboxActionForm;
import com.ideaknow.api.client.forms.nosessioninbox.NoSessionInboxForm;
import com.ideaknow.api.client.forms.nosessioninbox.NoSessionInboxListForm;
import com.ideaknow.api.client.forms.nosessionnotification.NoSessionNotificationsForm;
import com.ideaknow.api.client.forms.nosessiontpc.NoSessionTpcSecondKeyForm;
import com.ideaknow.api.client.forms.notification.NotificationForm;
import com.ideaknow.api.client.forms.offices.OfficesSearchForm;
import com.ideaknow.api.client.forms.product.ProductsCardsForm;
import com.ideaknow.api.client.forms.promolayers.PromoLayerAvailableForm;
import com.ideaknow.api.client.forms.promolayers.PromoLayerForm;
import com.ideaknow.api.client.forms.push.PushCreationForm;
import com.ideaknow.api.client.forms.push.PushDeviceListForm;
import com.ideaknow.api.client.forms.push.PushDeviceRegisterForm;
import com.ideaknow.api.client.forms.push.PushMessageActionForm;
import com.ideaknow.api.client.forms.push.PushMessageForm;
import com.ideaknow.api.client.forms.push.PushMessageListForm;
import com.ideaknow.api.client.forms.risk.RiskListForm;
import com.ideaknow.api.client.forms.session.SessionAgentForm;
import com.ideaknow.api.client.forms.session.SessionAnonymousForm;
import com.ideaknow.api.client.forms.session.SessionForm;
import com.ideaknow.api.client.forms.session.UserForm;
import com.ideaknow.api.client.forms.tpc.OtpForm;
import com.ideaknow.api.client.forms.tpc.TpcEnrollmentCreateForm;
import com.ideaknow.api.client.forms.tpc.TpcKeysOfflineForm;
import com.ideaknow.api.client.forms.tpc.TpcMobileForm;
import com.ideaknow.api.client.forms.tpc.TpcSecondKeyForm;
import com.ideaknow.api.client.forms.tpc.UpdateProcessPage1Form;
import com.ideaknow.api.client.forms.tpc.UpdateProcessPage2Form;
import com.ideaknow.api.client.forms.tpv.MerchantsListForm;
import com.ideaknow.api.client.forms.tpv.NewOperationForm;
import com.ideaknow.api.client.forms.tpv.OperationForm;
import com.ideaknow.api.client.forms.tpv.OperationListForm;
import com.ideaknow.api.client.forms.tpv.TerminalsForm;
import com.ideaknow.api.client.forms.transactionmonitoring.TransactionmonitoringForm;
import com.ideaknow.api.client.forms.transfers.BeneficiaryForm;
import com.ideaknow.api.client.forms.transfers.CommissionsForm;
import com.ideaknow.api.client.forms.transfers.DollarDatesForm;
import com.ideaknow.api.client.forms.transfers.OwnTransferConditionsDocumentForm;
import com.ideaknow.api.client.forms.transfers.OwnTransferForm;
import com.ideaknow.api.client.forms.transfers.PeriodicalTransferEndDateForm;
import com.ideaknow.api.client.forms.transfers.PeriodicalTransferForm;
import com.ideaknow.api.client.forms.transfers.TransferCancelConditionsDocumentForm;
import com.ideaknow.api.client.forms.transfers.TransferCancelForm;
import com.ideaknow.api.client.forms.transfers.TransferCommissionForm;
import com.ideaknow.api.client.forms.transfers.TransferDuplicatedForm;
import com.ideaknow.api.client.forms.transfers.TransferForm;
import com.ideaknow.api.client.forms.transfers.TransferInternationalBicForm;
import com.ideaknow.api.client.forms.transfers.TransfersForm;
import com.ideaknow.api.client.model.AtmMobileEnrollmentListModel;
import com.ideaknow.api.client.model.AtmMobileEnrollmentModel;
import com.ideaknow.api.client.model.BooleanResponseModel;
import com.ideaknow.api.client.model.PaginatorModel;
import com.ideaknow.api.client.model.StringResponseModel;
import com.ideaknow.api.client.model.accounts.AccountMovementsListModel;
import com.ideaknow.api.client.model.accounts.AccountPayersModel;
import com.ideaknow.api.client.model.accounts.AccountsListModel;
import com.ideaknow.api.client.model.agent.AgentModel;
import com.ideaknow.api.client.model.agent.AgentSessionModel;
import com.ideaknow.api.client.model.alerts.AlertContractListModel;
import com.ideaknow.api.client.model.alerts.AlertContractModel;
import com.ideaknow.api.client.model.atmmobile.AtmMobileCommissionListModel;
import com.ideaknow.api.client.model.atmmobile.AtmMobileOtpModel;
import com.ideaknow.api.client.model.banner.BannerModel;
import com.ideaknow.api.client.model.blacklist.BlackListModel;
import com.ideaknow.api.client.model.cards.CardActivationModel;
import com.ideaknow.api.client.model.cards.CardAllMovementsForm;
import com.ideaknow.api.client.model.cards.CardConditionsModel;
import com.ideaknow.api.client.model.cards.CardLastMovementModel;
import com.ideaknow.api.client.model.cards.CardListModel;
import com.ideaknow.api.client.model.cards.CardMovementGeoPointModel;
import com.ideaknow.api.client.model.cards.CardMovementsCreditSplitPeriodsModel;
import com.ideaknow.api.client.model.cards.CardMovementsDebitSplitPeriodsModel;
import com.ideaknow.api.client.model.cards.CardMovementsListModel;
import com.ideaknow.api.client.model.cards.CardPrepaidReloadAmountsModel;
import com.ideaknow.api.client.model.cards.CardPrepaidReloadCommissionsModel;
import com.ideaknow.api.client.model.cards.CardProfileCountriesListModel;
import com.ideaknow.api.client.model.cards.CardProfileRulesListModel;
import com.ideaknow.api.client.model.cards.CardSettlementsModel;
import com.ideaknow.api.client.model.checks.CheckModel;
import com.ideaknow.api.client.model.companies.CompaniesListModel;
import com.ideaknow.api.client.model.companies.CompanyCreditLimitsModel;
import com.ideaknow.api.client.model.directdebit.DirectDebitListModel;
import com.ideaknow.api.client.model.document.DocumentModel;
import com.ideaknow.api.client.model.glass.SessionAccountMovementsModel;
import com.ideaknow.api.client.model.glass.SessionAccountsModel;
import com.ideaknow.api.client.model.glass.SessionAgentAccountsModel;
import com.ideaknow.api.client.model.inbox.InboxesModel;
import com.ideaknow.api.client.model.informational.InformationalModel;
import com.ideaknow.api.client.model.instantmoney.InstantMoneyCommissionsModel;
import com.ideaknow.api.client.model.instantmoney.InstantMoneyModel;
import com.ideaknow.api.client.model.key.KeyModel;
import com.ideaknow.api.client.model.key.OtpQueryKeyModel;
import com.ideaknow.api.client.model.mail.MailListModel;
import com.ideaknow.api.client.model.menu.MenuModel;
import com.ideaknow.api.client.model.nfc.NfcSessionModel;
import com.ideaknow.api.client.model.offices.OfficeListModel;
import com.ideaknow.api.client.model.product.ProductsCardsModel;
import com.ideaknow.api.client.model.product.ProductsListModel;
import com.ideaknow.api.client.model.promolayers.PromoLayerResultModel;
import com.ideaknow.api.client.model.push.PushDeviceListModel;
import com.ideaknow.api.client.model.push.PushDeviceResponseModel;
import com.ideaknow.api.client.model.push.PushMessageListModel;
import com.ideaknow.api.client.model.push.PushMessageModel;
import com.ideaknow.api.client.model.risk.RiskRecordListModel;
import com.ideaknow.api.client.model.session.ContractListModel;
import com.ideaknow.api.client.model.session.SessionModel;
import com.ideaknow.api.client.model.session.UserModel;
import com.ideaknow.api.client.model.status.StatusModel;
import com.ideaknow.api.client.model.tpc.ContractResponseModel;
import com.ideaknow.api.client.model.tpc.TpcKeyListModel;
import com.ideaknow.api.client.model.tpv.MerchantListModel;
import com.ideaknow.api.client.model.tpv.TerminalListModel;
import com.ideaknow.api.client.model.tpv.TpvOperationListModel;
import com.ideaknow.api.client.model.tpv.TpvOperationModel;
import com.ideaknow.api.client.model.transfer.AccountTransferToCardModel;
import com.ideaknow.api.client.model.transfer.BanksModel;
import com.ideaknow.api.client.model.transfer.BeneficiariesModel;
import com.ideaknow.api.client.model.transfer.BeneficiaryResultModel;
import com.ideaknow.api.client.model.transfer.BicsModel;
import com.ideaknow.api.client.model.transfer.CardToAccountCommissionModel;
import com.ideaknow.api.client.model.transfer.CardToAccountTransferModel;
import com.ideaknow.api.client.model.transfer.CitiesModel;
import com.ideaknow.api.client.model.transfer.CommissionsModel;
import com.ideaknow.api.client.model.transfer.CountriesListModel;
import com.ideaknow.api.client.model.transfer.CurrenciesModel;
import com.ideaknow.api.client.model.transfer.DollarDatesModel;
import com.ideaknow.api.client.model.transfer.OwnTransferResponseModel;
import com.ideaknow.api.client.model.transfer.PeriodicalTransferResponseModel;
import com.ideaknow.api.client.model.transfer.TransferCancelModel;
import com.ideaknow.api.client.model.transfer.TransferResponseModel;
import com.ideaknow.api.client.model.transfer.TransfersListModel;
import com.ideaknow.api.client.network.NativeResponse;

import org.json.JSONObject;

import java.util.Map;

/**
 * A gateway to a source of model objects, it can be an implementation of a remote api using a
 * networking library, an access to a local database, a fake implementation with mocked data, ...
 *
 * A decision was made to not create an interface so in tests we can override only the calls we
 * need instead of implementing the whole interface.
 */
public abstract class IDKGateway {

    public static boolean DEBUG;

    /**
     * Set the debug flag for the gateway and its requests.
     *
     * @param debug
     */
    protected void setDebug(boolean debug) {
        DEBUG = debug;
    }

    protected String CURRENT_ACCEPT_LANGUAGE_HEADER_VALUE;

    /**
     * Set current application language for header "Accept-Language"
     *
     * @param currentLanguage
     */
    public void setCurrentAcceptLanguageHeaderValue(String currentLanguage) {
        CURRENT_ACCEPT_LANGUAGE_HEADER_VALUE = currentLanguage;
    }

    public void login(SessionForm form, final IDKGatewayResponse.Listener<SessionModel>
            responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void logout(final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void accounts(AccountsForm form,
            final IDKGatewayResponse.Listener<AccountsListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void accountsAlias(AccountForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void accountMovements(AccountMovementsForm form,
            final IDKGatewayResponse.Listener<AccountMovementsListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void accountMovementsDocument(AccountMovementDocumentForm form,
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void accountMovementReturnBill(AccountMovementReturnBillForm form,
            final IDKGatewayResponse.Listener<BooleanResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void accountMovementSplit(AccountMovementsDebitSplitForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void accountPayers(AccountPayersForm form,
            final IDKGatewayResponse.Listener<AccountPayersModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void accountTransferToCard(TransferToCardForm form,
            final IDKGatewayResponse.Listener<AccountTransferToCardModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void activeAgent(AgentForm form,
            final IDKGatewayResponse.Listener<AgentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void activeAgentMyAvailability(MyAvailabilityForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void agentAvailable(
            final IDKGatewayResponse.Listener<BooleanResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void atmCommissions(AtmMobileCommissionForm form,
            final IDKGatewayResponse.Listener<AtmMobileCommissionListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void atmCreate(EnrollmentCreateForm form,
            final IDKGatewayResponse.Listener<AtmMobileEnrollmentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void atmCreateOTP(OtpGenerationForm form,
            final IDKGatewayResponse.Listener<AtmMobileOtpModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void atmEnrollments(EnrollmentListForm form,
            final IDKGatewayResponse.Listener<AtmMobileEnrollmentListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void atmRemoveOTP(OtpRemoveForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void alertsContracts(
            final IDKGatewayResponse.Listener<AlertContractListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void bannerProduct(BannerForm form,
            final IDKGatewayResponse.Listener<BannerModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void bannerWallet(BannerForm form,
            final IDKGatewayResponse.Listener<BannerModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void blacklist(final IDKGatewayResponse.Listener<BlackListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void cancelPendingRequests() {
    }

    public void cards(String filter, PaginatorModel paginator,
            final IDKGatewayResponse.Listener<CardListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void cardsAlias(CardForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void cardActivation(CardActivationForm form,
            final IDKGatewayResponse.Listener<CardActivationModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void cardActivationPdfGeneral(DocumentForm form,
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void cardActivationPdfSpecific(CardPDFConditionForm form,
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void cardBlock(CardBlockedForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void cardConditions(CardConditionsForm form,
            final IDKGatewayResponse.Listener<CardConditionsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void cardConditionsUpdate(CardConditionsUpdateForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void cardMovementGeopoint(CardMovementGeoPointForm form,
            final IDKGatewayResponse.Listener<CardMovementGeoPointModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void cardMovementsUnconfirmedLast(CardLastMovementForm form,
            final IDKGatewayResponse.Listener<CardLastMovementModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void cardMovements(CardAllMovementsForm card,
            final IDKGatewayResponse.Listener<CardMovementsListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void cardMovementsCreditSplitPeriods(CardMovementsCreditSplitPeriodsForm form,
            final IDKGatewayResponse.Listener<CardMovementsCreditSplitPeriodsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void cardMovementsCreditSplit(CardMovementsCreditSplitForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void cardMovementsDebitSplitPeriods(CardMovementsDebitSplitPeriodsForm form,
            final IDKGatewayResponse.Listener<CardMovementsDebitSplitPeriodsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void cardMovementsDebitSplit(CardMovementsDebitSplitForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void cardPinRecovery(CardSecondKeyForm form,
            final IDKGatewayResponse.Listener<StringResponseModel> listener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void cardPrepaidReload(CardPrepaidReloadForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void cardPrepaidReloadAmounts(CardForm form,
            final IDKGatewayResponse.Listener<CardPrepaidReloadAmountsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void cardPrepaidReloadCommissions(CardPrepaidReloadCommissionsForm form,
            final IDKGatewayResponse.Listener<CardPrepaidReloadCommissionsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void cardProfiles(CardForm form,
            final IDKGatewayResponse.Listener<CardProfileRulesListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void cardProfilesCountries(
            final IDKGatewayResponse.Listener<CardProfileCountriesListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void cardProfilesRules(CardProfileForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void cardSettlements(CardSettlementsForm form,
            final IDKGatewayResponse.Listener<CardSettlementsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void cardSettlementDoc(CardSettlementDocForm form,
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void cardSticker(CardStickerForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void changePin(ChangePinForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void clickToCall(ClickToCallForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void companies(CompanyForm form,
            final IDKGatewayResponse.Listener<CompaniesListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void companyCreditLimits(LimitForm form,
            final IDKGatewayResponse.Listener<CompanyCreditLimitsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void companyCreditLimitsAssigned(LimitAssignedForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void companyCreditLimitsConditions(
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void contactDataUpdateEmail(UpdateEmailForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void contactDataUpdateEmailPdf(
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void countries(
            final IDKGatewayResponse.Listener<CountriesListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void creditLimit(CardLimitForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void debitLimit(CardLimitForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void directDebit(DirectDebitListForm form,
            final IDKGatewayResponse.Listener<DirectDebitListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void directDebitUpdate(DirectDebitForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void contracts(UserForm form,
            final IDKGatewayResponse.Listener<ContractListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void inbox(InboxForm form,
            final IDKGatewayResponse.Listener<InboxesModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void informational(InformationalForm form,
            final IDKGatewayResponse.Listener<InformationalModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void instantCashCommission(CardToAccountCommissionForm form,
            final IDKGatewayResponse.Listener<CardToAccountCommissionModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void instantCashTransfer(CardToAccountTransferForm form,
            final IDKGatewayResponse.Listener<CardToAccountTransferModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void instantCheck(CheckForm form,
            final IDKGatewayResponse.Listener<CheckModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void instantCheckOcr(CheckInstantForm form,
            final IDKGatewayResponse.Listener<CheckModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void instantMoney(InstantMoneyForm form,
            final IDKGatewayResponse.Listener<InstantMoneyModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void instantMoneyActivation(InstantMoneyActivationForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void instantMoneyCommissions(InstantMoneyCommissionsForm form,
            final IDKGatewayResponse.Listener<InstantMoneyCommissionsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void mailDocument(MailDocumentForm form,
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void mailList(MailListForm form,
            final IDKGatewayResponse.Listener<MailListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void mailMarkAsRead(MailsForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void menu(MenuForm form,
            final IDKGatewayResponse.Listener<MenuModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void message(PushMessageForm form,
            final IDKGatewayResponse.Listener<PushMessageModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void messageList(PushMessageListForm form,
            final IDKGatewayResponse.Listener<PushMessageListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void messageMarkAsRead(PushMessageActionForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void messageRemove(PushMessageActionForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void namingList(final IDKGatewayResponse.Listener<JSONObject> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void noSessionInboxEnrollment(EnrollmentCreateForm form,
            final IDKGatewayResponse.Listener<AtmMobileEnrollmentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener){
    }

    public void noSessionInboxEnrollments(EnrollmentListForm form,
            final IDKGatewayResponse.Listener<AtmMobileEnrollmentListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener){
    }

    public void noSessionInboxMessage(NoSessionInboxForm form,
            final IDKGatewayResponse.Listener<PushMessageModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void noSessionInboxMessageDelete(NoSessionInboxActionForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void noSessionInboxMessageMarkAsRead(NoSessionInboxActionForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void noSessionInboxMessages(NoSessionInboxListForm form,
            final IDKGatewayResponse.Listener<PushMessageListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void noSessionInboxUnenrollment(EnrollmentRemoveForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void noSessionNotifications(NoSessionNotificationsForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void noSessionTpc(NoSessionTpcSecondKeyForm form,
            final IDKGatewayResponse.Listener<KeyModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void notification(NotificationForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void offices(OfficesSearchForm form,
            final IDKGatewayResponse.Listener<OfficeListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void otpTpcGeneration(OtpForm form,
            final IDKGatewayResponse.Listener<OtpQueryKeyModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void ownTransfer(OwnTransferForm form,
            final IDKGatewayResponse.Listener<OwnTransferResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void ownTransferConditionsDocument(OwnTransferConditionsDocumentForm form,
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void products(final IDKGatewayResponse.Listener<ProductsListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void productsCards(ProductsCardsForm form,
            final IDKGatewayResponse.Listener<ProductsCardsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void promolayer(PromoLayerForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void promolayerAvailable(PromoLayerAvailableForm form,
            final IDKGatewayResponse.Listener<PromoLayerResultModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void pushContract(PushCreationForm form,
            final IDKGatewayResponse.Listener<AlertContractModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void pushContracts(
            final IDKGatewayResponse.Listener<AlertContractListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void pushDeviceRegister(PushDeviceRegisterForm form,
            final IDKGatewayResponse.Listener<PushDeviceResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void pushDeviceRemove(PushDeviceRegisterForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void pushDevices(PushDeviceListForm form,
            final IDKGatewayResponse.Listener<PushDeviceListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void pushDeviceRefreshRegister(PushDeviceRegisterForm form,
            final IDKGatewayResponse.Listener<PushDeviceResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void riskRecords(RiskListForm form,
            final IDKGatewayResponse.Listener<RiskRecordListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void secondKey(SecondKeyForm form,
            final IDKGatewayResponse.Listener<KeyModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void status(String statusAppCode,
            final IDKGatewayResponse.Listener<StatusModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void sessionAnonymousLogin(SessionAnonymousForm form,
            final IDKGatewayResponse.Listener<UserModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void sessionAnonymousLogout(final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void tpcCreate(TpcEnrollmentCreateForm form,
            final IDKGatewayResponse.Listener<TpcKeyListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void tpcEnrollments(EnrollmentListForm form,
            final IDKGatewayResponse.Listener<AtmMobileEnrollmentListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void tpcKeys(TpcKeysOfflineForm form,
            final IDKGatewayResponse.Listener<TpcKeyListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void tpcMobile(TpcMobileForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void tpcMobileUpdate(TpcMobileForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void tpcSecondKey(TpcSecondKeyForm form,
            final IDKGatewayResponse.Listener<KeyModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void tpcUpdateProcessPage1(UpdateProcessPage1Form form,
            final IDKGatewayResponse.Listener<ContractResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void tpcUpdateProcessPage2(UpdateProcessPage2Form form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void tpvMerchants(MerchantsListForm form,
            final IDKGatewayResponse.Listener<MerchantListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void tpvTerminals(TerminalsForm form,
            final IDKGatewayResponse.Listener<TerminalListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void tpvOperations(OperationListForm form,
            final IDKGatewayResponse.Listener<TpvOperationListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void tpvOperationsOperation(NewOperationForm form,
            final IDKGatewayResponse.Listener<TpvOperationModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void tpvOperationsOperationStatus(OperationForm form,
            final IDKGatewayResponse.Listener<TpvOperationModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void tpvOperationsRefund(OperationForm form,
            final IDKGatewayResponse.Listener<TpvOperationModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void transactionMonitoring(TransactionmonitoringForm form,
            final IDKGatewayResponse.Listener<KeyModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void transferCancel(TransferCancelForm form,
            final IDKGatewayResponse.Listener<TransferCancelModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void transferCancelConditionsDocument(TransferCancelConditionsDocumentForm form,
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void transferInternational(TransferForm form,
            final IDKGatewayResponse.Listener<TransferResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void transferInternationalBanks(TransferInternationalBicForm form,
            final IDKGatewayResponse.Listener<BanksModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void transferInternationalBeneficiaries(
            final IDKGatewayResponse.Listener<BeneficiariesModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void transferInternationalBeneficiariesCreate(BeneficiaryForm form,
            final IDKGatewayResponse.Listener<BeneficiaryResultModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void transferInternationalBeneficiariesDelete(BeneficiaryForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void transferInternationalBeneficiariesDetail(BeneficiaryForm form,
            final IDKGatewayResponse.Listener<BeneficiaryResultModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void transferInternationalBeneficiariesUpdate(BeneficiaryForm form,
            final IDKGatewayResponse.Listener<BeneficiaryResultModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void transferInternationalBic(TransferInternationalBicForm form,
            final IDKGatewayResponse.Listener<BicsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void transferInternationalCities(TransferInternationalBicForm form,
            final IDKGatewayResponse.Listener<CitiesModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void transferInternationalCommissions(CommissionsForm form,
            final IDKGatewayResponse.Listener<CommissionsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void transferInternationalCountries(
            final IDKGatewayResponse.Listener<CountriesListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void transferInternationalCurrencies(
            final IDKGatewayResponse.Listener<CurrenciesModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void transferInternationalDollarDates(DollarDatesForm form,
            final IDKGatewayResponse.Listener<DollarDatesModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void transferNational(TransferForm form,
            final IDKGatewayResponse.Listener<TransferResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void transferNationalBeneficiaries(
            final IDKGatewayResponse.Listener<BeneficiariesModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void transferNationalBeneficiariesCreate(BeneficiaryForm form,
            final IDKGatewayResponse.Listener<BeneficiaryResultModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void transferNationalBeneficiariesDelete(BeneficiaryForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void transferNationalBeneficiariesDetail(BeneficiaryForm form,
            final IDKGatewayResponse.Listener<BeneficiaryResultModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void transferNationalBeneficiariesUpdate(BeneficiaryForm form,
            final IDKGatewayResponse.Listener<BeneficiaryResultModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void transferNationalCommissions(CommissionsForm form,
            final IDKGatewayResponse.Listener<CommissionsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void transferNationalCommissionsDocument(TransferCommissionForm form,
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void transferNationalDuplicated(TransferDuplicatedForm form,
            final IDKGatewayResponse.Listener<BooleanResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void transfersList(TransfersForm form,
            final IDKGatewayResponse.Listener<TransfersListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void transferNationalPeriodicalCreate(PeriodicalTransferForm form,
            final IDKGatewayResponse.Listener<PeriodicalTransferResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void transferNationalPeriodicalEndDate(PeriodicalTransferEndDateForm form,
            final IDKGatewayResponse.Listener<StringResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    // ########################################
    // Glass WebServices
    // ########################################

    public void glassAgent(SessionAgentForm form,
            final IDKGatewayResponse.Listener<AgentSessionModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void glassAgentAccounts(SessionAccountsForm form,
            final IDKGatewayResponse.Listener<SessionAgentAccountsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void glassAccounts(SessionAccountsForm form,
            final IDKGatewayResponse.Listener<SessionAccountsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void glassAccountsMovements(SessionAccountMovementsForm form,
            final IDKGatewayResponse.Listener<SessionAccountMovementsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    // ########################################
    // Wallet WebServices
    // ########################################
    public void nfcSession(NfcSessionForm form,
            final IDKGatewayResponse.Listener<NfcSessionModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void nfcSignupCard(NfcSignUpUnsubscribeForm form,
            final IDKGatewayResponse.Listener<NfcSignUpCardModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void nfcSignupCardDelete(NfcSignUpUnsubscribeForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    // ########################################
    // Html plugins methods
    // ########################################

    public void downloadPdf(String url, String params, String httpMethod,
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void htmlToNativeRequest(String url, String method, String body, Map<String, String> headers,
            final IDKGatewayResponse.Listener<NativeResponse> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
    }

    /*
     * Service Healt requests
     */
    public void serviceHealth(final IDKGatewayResponse.Listener<Void> responseListener,
                              final IDKGatewayResponse.ErrorListener errorListener) {
    }

    public void serviceHealthFake(int operation, final IDKGatewayResponse.Listener<Void> responseListener,
                              final IDKGatewayResponse.ErrorListener errorListener) {
    }
}



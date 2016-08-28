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
import com.ideaknow.api.client.forms.tpc.TpcEnrollmentCreateForm;
import com.ideaknow.api.client.forms.tpc.TpcKeysOfflineForm;
import com.ideaknow.api.client.forms.tpc.TpcMobileForm;
import com.ideaknow.api.client.forms.tpc.TpcSecondKeyForm;
import com.ideaknow.api.client.forms.tpc.UpdateProcessPage1Form;
import com.ideaknow.api.client.forms.tpc.UpdateProcessPage2Form;
import com.ideaknow.api.client.forms.tpc.OtpForm;
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
import com.ideaknow.api.client.tests.mock.model.MockFactory;

import java.util.*;

public class IDKFakeGateway extends IDKGateway {

    public static final int CASE_TPC = 1;
    public static final int CASE_VTPC1_USER_DEVICE = 2;
    public static final int CASE_VTPC1_OTHER_DEVICE = 3;
    public static final int CASE_VTPC2 = 4;

    private int mUserSignatureType;
    private boolean mOperationHasRisk;

    public IDKFakeGateway() {
        mUserSignatureType = CASE_TPC;
        mOperationHasRisk = false;
    }

    public IDKFakeGateway(int secondKeyCase, boolean operationHasRisk) {
        mUserSignatureType = secondKeyCase;
        mOperationHasRisk = operationHasRisk;
    }

    @Override
    public void login(SessionForm form,
            final IDKGatewayResponse.Listener<SessionModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.sessionModel());
    }

    @Override
    public void logout(final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(null);
    }

    @Override
    public void activeAgent(AgentForm form,
            final IDKGatewayResponse.Listener<AgentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.agentModel());
    }

    @Override
    public void agentAvailable(
            final IDKGatewayResponse.Listener<BooleanResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.agentAvailableModel());
    }

    @Override
    public void accounts(AccountsForm form,
            final IDKGatewayResponse.Listener<AccountsListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.accountListModel());
    }

    @Override
    public void accountsAlias(AccountForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(null);
    }

    @Override
    public void accountMovements(AccountMovementsForm form,
            final IDKGatewayResponse.Listener<AccountMovementsListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.accountMovementsListModel());
    }

    @Override
    public void accountMovementsDocument(AccountMovementDocumentForm form,
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.documentModel());
    }

    @Override
    public void accountMovementReturnBill(AccountMovementReturnBillForm form,
            final IDKGatewayResponse.Listener<BooleanResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.booleanResponseModel());
    }

    @Override
    public void accountMovementSplit(AccountMovementsDebitSplitForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(null);
    }

    @Override
    public void accountPayers(AccountPayersForm form,
            final IDKGatewayResponse.Listener<AccountPayersModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.accountPayers());
    }

    @Override
    public void activeAgentMyAvailability(MyAvailabilityForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(null);
    }

    @Override
    public void accountTransferToCard(TransferToCardForm form,
            final IDKGatewayResponse.Listener<AccountTransferToCardModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.accountTransferToCardModel());
    }

    @Override
    public void alertsContracts(
            final IDKGatewayResponse.Listener<AlertContractListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.alertContractListModel());
    }

    @Override
    public void atmCommissions(AtmMobileCommissionForm form,
            final IDKGatewayResponse.Listener<AtmMobileCommissionListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.atmMobileCommissionListModel());
    }

    @Override
    public void atmCreate(EnrollmentCreateForm form,
            final IDKGatewayResponse.Listener<AtmMobileEnrollmentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.atmMobileEnrollmentModel());
    }

    @Override
    public void atmCreateOTP(OtpGenerationForm form,
            final IDKGatewayResponse.Listener<AtmMobileOtpModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.atmMobileOtpModel());
    }

    @Override
    public void atmEnrollments(EnrollmentListForm form,
            final IDKGatewayResponse.Listener<AtmMobileEnrollmentListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.atmMobileEnrollmentListModel());
    }

    @Override
    public void atmRemoveOTP(OtpRemoveForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(null);
    }

    @Override
    public void bannerProduct(BannerForm form,
            final IDKGatewayResponse.Listener<BannerModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.productBanner());
    }

    @Override
    public void bannerWallet(BannerForm form,
            final IDKGatewayResponse.Listener<BannerModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.walletBanner());
    }

    @Override
    public void blacklist(final IDKGatewayResponse.Listener<BlackListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.blacklistModel());
    }

    @Override
    public void cards(String filter, PaginatorModel paginator,
            final IDKGatewayResponse.Listener<CardListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.cardListModel());
    }

    @Override
    public void cardsAlias(CardForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(null);
    }

    @Override
    public void cardActivation(CardActivationForm form,
            final IDKGatewayResponse.Listener<CardActivationModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.cardActivationModel());
    }

    @Override
    public void cardActivationPdfGeneral(DocumentForm form,
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.documentGeneralConditionsModel());
    }

    @Override
    public void cardActivationPdfSpecific(CardPDFConditionForm form,
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.documentSpecificConditionsModel());
    }

    @Override
    public void cardBlock(CardBlockedForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(null);
    }

    @Override
    public void cardConditions(CardConditionsForm form,
            final IDKGatewayResponse.Listener<CardConditionsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.cardConditionsModel());
    }

    @Override
    public void cardConditionsUpdate(CardConditionsUpdateForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(null);
    }

    @Override
    public void cardMovementGeopoint(CardMovementGeoPointForm form,
            final IDKGatewayResponse.Listener<CardMovementGeoPointModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.cardMovementsGeopointModel());
    }

    @Override
    public void cardMovements(CardAllMovementsForm form,
            final IDKGatewayResponse.Listener<CardMovementsListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.cardMovementsListModel());
    }

    @Override
    public void cardMovementsUnconfirmedLast(CardLastMovementForm form,
            final IDKGatewayResponse.Listener<CardLastMovementModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.cardLastMovement());
    }

    @Override
    public void cardMovementsCreditSplitPeriods(CardMovementsCreditSplitPeriodsForm form,
            final IDKGatewayResponse.Listener<CardMovementsCreditSplitPeriodsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.cardMovementsCreditSplitPeriodsModel());
    }

    @Override
    public void cardMovementsCreditSplit(CardMovementsCreditSplitForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(null);
    }

    @Override
    public void cardMovementsDebitSplitPeriods(CardMovementsDebitSplitPeriodsForm form,
            final IDKGatewayResponse.Listener<CardMovementsDebitSplitPeriodsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.cardMovementsDebitSplitPeriodsModel());
    }

    @Override
    public void cardMovementsDebitSplit(CardMovementsDebitSplitForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(null);
    }

    @Override
    public void cardPinRecovery(CardSecondKeyForm form,
            final IDKGatewayResponse.Listener<StringResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.stringResponseModel());
    }

    @Override
    public void cardPrepaidReload(CardPrepaidReloadForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(null);
    }

    public void cardPrepaidReloadAmounts(CardForm form,
            final IDKGatewayResponse.Listener<CardPrepaidReloadAmountsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.cardPrepaidReloadAmountsModel());
    }

    @Override
    public void cardPrepaidReloadCommissions(CardPrepaidReloadCommissionsForm form,
            final IDKGatewayResponse.Listener<CardPrepaidReloadCommissionsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.cardPrepaidReloadCommissionsModel());
    }

    @Override
    public void cardProfiles(CardForm form,
            final IDKGatewayResponse.Listener<CardProfileRulesListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.cardProfileRulesListModel());
    }

    @Override
    public void cardProfilesCountries(
            final IDKGatewayResponse.Listener<CardProfileCountriesListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.cardProfileCountriesListModel());
    }

    @Override
    public void cardProfilesRules(CardProfileForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(null);
    }

    @Override
    public void cardSettlements(CardSettlementsForm form,
            final IDKGatewayResponse.Listener<CardSettlementsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.cardSettlementsModel());
    }

    @Override
    public void cardSettlementDoc(CardSettlementDocForm form,
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.documentModel());
    }

    @Override
    public void cardSticker(CardStickerForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(null);
    }

    @Override
    public void changePin(ChangePinForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(null);
    }

    @Override
    public void clickToCall(ClickToCallForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(null);
    }

    @Override
    public void contracts(UserForm form,
            final IDKGatewayResponse.Listener<ContractListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.contractListModel());
    }

    @Override
    public void companies(CompanyForm form,
            final IDKGatewayResponse.Listener<CompaniesListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.companiesListModel());
    }

    @Override
    public void companyCreditLimits(LimitForm form,
            final IDKGatewayResponse.Listener<CompanyCreditLimitsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.companyCreditLimits());
    }

    @Override
    public void companyCreditLimitsAssigned(LimitAssignedForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(null);
    }

    @Override
    public void companyCreditLimitsConditions(
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.companyCreditLimitsConditions());
    }

    @Override
    public void contactDataUpdateEmail(UpdateEmailForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(null);
    }

    @Override
    public void contactDataUpdateEmailPdf(
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.documentModel());
    }

    @Override
    public void countries(
            final IDKGatewayResponse.Listener<CountriesListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.countriesListModel());
    }

    @Override
    public void creditLimit(CardLimitForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(null);
    }

    @Override
    public void debitLimit(CardLimitForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(null);
    }

    @Override
    public void directDebit(DirectDebitListForm form,
            final IDKGatewayResponse.Listener<DirectDebitListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.directDebitListModel());
    }

    @Override
    public void directDebitUpdate(DirectDebitForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(null);
    }

    public void inbox(InboxForm form,
            final IDKGatewayResponse.Listener<InboxesModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.getInboxesModel());
    }

    @Override
    public void instantCashCommission(CardToAccountCommissionForm form,
            final IDKGatewayResponse.Listener<CardToAccountCommissionModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.cardToAccountCommissionModel());
    }

    @Override
    public void instantCashTransfer(CardToAccountTransferForm form,
            final IDKGatewayResponse.Listener<CardToAccountTransferModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.cardToAccountTransferModel());
    }

    @Override
    public void instantCheck(CheckForm form,
            final IDKGatewayResponse.Listener<CheckModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.checkModel());
    }

    @Override
    public void instantCheckOcr(CheckInstantForm form,
            final IDKGatewayResponse.Listener<CheckModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.checkModel());
    }

    @Override
    public void instantMoney(InstantMoneyForm form,
            final IDKGatewayResponse.Listener<InstantMoneyModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.instantMoneyModel());
    }

    @Override
    public void instantMoneyActivation(InstantMoneyActivationForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(null);
    }

    @Override
    public void instantMoneyCommissions(InstantMoneyCommissionsForm form,
            final IDKGatewayResponse.Listener<InstantMoneyCommissionsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.instantMoneyCommissionsModel());
    }

    @Override
    public void mailDocument(MailDocumentForm form,
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.documentModel());
    }

    @Override
    public void mailList(MailListForm form,
            final IDKGatewayResponse.Listener<MailListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.mailListModel());
    }

    @Override
    public void mailMarkAsRead(MailsForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(null);
    }

    @Override
    public void menu(MenuForm form,
            final IDKGatewayResponse.Listener<MenuModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.menuModel());
    }

    @Override
    public void message(PushMessageForm form,
            final IDKGatewayResponse.Listener<PushMessageModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.pushMessageModel());
    }

    @Override
    public void messageList(PushMessageListForm form,
            final IDKGatewayResponse.Listener<PushMessageListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.pushMessageListModel());
    }

    @Override
    public void messageMarkAsRead(PushMessageActionForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(null);
    }

    @Override
    public void messageRemove(PushMessageActionForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(null);
    }

    @Override
    public void noSessionInboxEnrollment(EnrollmentCreateForm form,
            final IDKGatewayResponse.Listener<AtmMobileEnrollmentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.atmMobileEnrollmentModel());
    }

    @Override
    public void noSessionInboxEnrollments(EnrollmentListForm form,
            final IDKGatewayResponse.Listener<AtmMobileEnrollmentListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.atmMobileEnrollmentListModel());
    }

    @Override
    public void noSessionInboxMessage(NoSessionInboxForm form,
            final IDKGatewayResponse.Listener<PushMessageModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.pushMessageModel());
    }

    @Override
    public void noSessionInboxMessageMarkAsRead(NoSessionInboxActionForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(null);
    }

    @Override
    public void noSessionInboxMessages(NoSessionInboxListForm form,
            final IDKGatewayResponse.Listener<PushMessageListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.pushMessageListModel());
    }

    @Override
    public void noSessionInboxUnenrollment(EnrollmentRemoveForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(null);
    }

    @Override
    public void noSessionNotifications(NoSessionNotificationsForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(null);
    }

    @Override
    public void noSessionTpc(NoSessionTpcSecondKeyForm form,
            final IDKGatewayResponse.Listener<KeyModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.keyModelVtpc(mOperationHasRisk));
    }

    @Override
    public void notification(NotificationForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(null);
    }

    @Override
    public void offices(OfficesSearchForm form,
            final IDKGatewayResponse.Listener<OfficeListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.officesListModel());
    }

    @Override
    public void otpTpcGeneration(OtpForm form,
            final IDKGatewayResponse.Listener<OtpQueryKeyModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.otpQueryKeyModel(mOperationHasRisk));
    }

    @Override
    public void ownTransfer(OwnTransferForm form,
            final IDKGatewayResponse.Listener<OwnTransferResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.ownTransferResponseModel());
    }

    @Override
    public void ownTransferConditionsDocument(OwnTransferConditionsDocumentForm form,
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.documentModel());
    }

    @Override
    public void products(final IDKGatewayResponse.Listener<ProductsListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.productsModel());
    }

    @Override
    public void productsCards(ProductsCardsForm form,
            final IDKGatewayResponse.Listener<ProductsCardsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.productsCardsModel());
    }

    @Override
    public void promolayer(PromoLayerForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(null);
    }

    @Override
    public void promolayerAvailable(PromoLayerAvailableForm form,
            final IDKGatewayResponse.Listener<PromoLayerResultModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.promoLayerResultModel());
    }

    @Override
    public void pushContract(PushCreationForm form,
            final IDKGatewayResponse.Listener<AlertContractModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.alertContractModel());
    }

    @Override
    public void pushContracts(IDKGatewayResponse.Listener<AlertContractListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.alertContractsModel());
    }

    @Override
    public void pushDeviceRegister(PushDeviceRegisterForm form,
            final IDKGatewayResponse.Listener<PushDeviceResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.pushDeviceResponseModel());
    }

    @Override
    public void pushDeviceRemove(PushDeviceRegisterForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(null);
    }

    @Override
    public void pushDevices(PushDeviceListForm form,
            final IDKGatewayResponse.Listener<PushDeviceListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.pushDeviceListModel());
    }

    @Override
    public void pushDeviceRefreshRegister(PushDeviceRegisterForm form,
            final IDKGatewayResponse.Listener<PushDeviceResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.pushDeviceResponseModel());
    }

    @Override
    public void riskRecords(RiskListForm form,
            final IDKGatewayResponse.Listener<RiskRecordListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.riskRecordListModel());
    }

    @Override
    public void secondKey(SecondKeyForm form,
            final IDKGatewayResponse.Listener<KeyModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        KeyModel keyModel;
        switch (mUserSignatureType) {
        case CASE_VTPC1_USER_DEVICE:
        case CASE_VTPC1_OTHER_DEVICE:
            keyModel = MockFactory.keyModelVtpc(mOperationHasRisk);
            break;
        case CASE_VTPC2:
            keyModel = MockFactory.keyModelVtpc2();
            break;
        default:
            keyModel = MockFactory.keyModel(mOperationHasRisk);
            break;
        }

        responseListener.onResponse(keyModel);
    }

    @Override
    public void status(String statusAppCode,
            final IDKGatewayResponse.Listener<StatusModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.statusModel());
    }

    @Override
    public void sessionAnonymousLogin(SessionAnonymousForm form,
            final IDKGatewayResponse.Listener<UserModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.userModel());
    }

    @Override
    public void sessionAnonymousLogout(final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(null);
    }

    @Override
    public void tpcCreate(TpcEnrollmentCreateForm form,
            final IDKGatewayResponse.Listener<TpcKeyListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.tpcKeyListModel());
    }

    @Override
    public void tpcEnrollments(EnrollmentListForm form,
            final IDKGatewayResponse.Listener<AtmMobileEnrollmentListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.atmMobileEnrollmentListModel());
    }

    @Override
    public void tpcKeys(TpcKeysOfflineForm form,
            final IDKGatewayResponse.Listener<TpcKeyListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.tpcKeyListModel());
    }

    @Override
    public void tpcMobile(TpcMobileForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(null);
    }

    @Override
    public void tpcMobileUpdate(TpcMobileForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(null);
    }

    @Override
    public void tpcSecondKey(TpcSecondKeyForm form,
            final IDKGatewayResponse.Listener<KeyModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        KeyModel keyModel;
        switch (mUserSignatureType) {
        case CASE_VTPC1_USER_DEVICE:
        case CASE_VTPC1_OTHER_DEVICE:
            keyModel = MockFactory.keyModelVtpcPassword(mOperationHasRisk);
            break;
        default:
            keyModel = MockFactory.keyModelVtpc(mOperationHasRisk);
            break;
        }

        responseListener.onResponse(keyModel);
    }

    @Override
    public void tpcUpdateProcessPage1(UpdateProcessPage1Form form,
            final IDKGatewayResponse.Listener<ContractResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.contractResponseModel());
    }

    @Override
    public void tpcUpdateProcessPage2(UpdateProcessPage2Form form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(null);
    }

    @Override
    public void tpvMerchants(MerchantsListForm form,
            final IDKGatewayResponse.Listener<MerchantListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.merchantsListModel());
    }

    @Override
    public void tpvTerminals(TerminalsForm form,
            final IDKGatewayResponse.Listener<TerminalListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.terminalListModel());
    }

    @Override
    public void tpvOperations(OperationListForm form,
            final IDKGatewayResponse.Listener<TpvOperationListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.tpvOperationListModel());
    }

    @Override
    public void tpvOperationsOperation(NewOperationForm form,
            final IDKGatewayResponse.Listener<TpvOperationModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.tpvOperationModel());
    }

    @Override
    public void tpvOperationsOperationStatus(OperationForm form,
            final IDKGatewayResponse.Listener<TpvOperationModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.tpvOperationModel());
    }

    @Override
    public void tpvOperationsRefund(OperationForm form,
            final IDKGatewayResponse.Listener<TpvOperationModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.tpvOperationModel());
    }

    @Override
    public void transactionMonitoring(TransactionmonitoringForm form,
            final IDKGatewayResponse.Listener<KeyModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        KeyModel keyModel;
        switch (mUserSignatureType) {
        case CASE_TPC:
            keyModel = MockFactory.keyModel(mOperationHasRisk);
            break;
        case CASE_VTPC2:
            keyModel = MockFactory.keyModelVtpc2();
            break;
        default:
            keyModel = MockFactory.keyModel(mOperationHasRisk);
            break;
        }
        responseListener.onResponse(keyModel);
    }

    @Override
    public void transferCancel(TransferCancelForm form,
            final IDKGatewayResponse.Listener<TransferCancelModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.cancelTransferModel());
    }

    @Override
    public void transferCancelConditionsDocument(TransferCancelConditionsDocumentForm form,
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.documentModel());
    }

    @Override
    public void transferInternational(TransferForm form,
            final IDKGatewayResponse.Listener<TransferResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.transferInterationalResponseModel());
    }

    @Override
    public void transferInternationalBanks(TransferInternationalBicForm form,
            final IDKGatewayResponse.Listener<BanksModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.banksModel());
    }

    @Override
    public void transferInternationalBeneficiaries(
            final IDKGatewayResponse.Listener<BeneficiariesModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.beneficiariesModel());
    }

    @Override
    public void transferInternationalBeneficiariesCreate(BeneficiaryForm form,
            final IDKGatewayResponse.Listener<BeneficiaryResultModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.beneficiaryResultModel());
    }

    @Override
    public void transferInternationalBeneficiariesDelete(BeneficiaryForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(null);
    }

    @Override
    public void transferInternationalBeneficiariesDetail(BeneficiaryForm form,
            final IDKGatewayResponse.Listener<BeneficiaryResultModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.beneficiaryResultModel());
    }

    @Override
    public void transferInternationalBeneficiariesUpdate(BeneficiaryForm form,
            final IDKGatewayResponse.Listener<BeneficiaryResultModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.beneficiaryResultModel());
    }

    @Override
    public void transferInternationalBic(TransferInternationalBicForm form,
            final IDKGatewayResponse.Listener<BicsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.bicsModel());
    }

    @Override
    public void transferInternationalCities(TransferInternationalBicForm form,
            final IDKGatewayResponse.Listener<CitiesModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.citiesModel());
    }

    @Override
    public void transferInternationalCommissions(CommissionsForm form,
            final IDKGatewayResponse.Listener<CommissionsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.commissionsModel());
    }

    @Override
    public void transferInternationalCountries(
            final IDKGatewayResponse.Listener<CountriesListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.countriesListModel());
    }

    @Override
    public void transferInternationalCurrencies(
            final IDKGatewayResponse.Listener<CurrenciesModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.currenciesModel());
    }

    @Override
    public void transferInternationalDollarDates(DollarDatesForm form,
            final IDKGatewayResponse.Listener<DollarDatesModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.dollarDatesModel());
    }

    @Override
    public void transferNational(TransferForm form,
            final IDKGatewayResponse.Listener<TransferResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.transferNationalResponseModel());
    }

    @Override
    public void transferNationalBeneficiaries(
            final IDKGatewayResponse.Listener<BeneficiariesModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.beneficiariesModel());
    }

    @Override
    public void transferNationalBeneficiariesCreate(BeneficiaryForm form,
            final IDKGatewayResponse.Listener<BeneficiaryResultModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.beneficiaryResultModel());
    }

    @Override
    public void transferNationalBeneficiariesDelete(BeneficiaryForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(null);
    }

    @Override
    public void transferNationalBeneficiariesDetail(BeneficiaryForm form,
            final IDKGatewayResponse.Listener<BeneficiaryResultModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.beneficiaryResultModel());
    }

    @Override
    public void transferNationalBeneficiariesUpdate(BeneficiaryForm form,
            final IDKGatewayResponse.Listener<BeneficiaryResultModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.beneficiaryResultModel());
    }

    @Override
    public void transferNationalCommissions(CommissionsForm form,
            final IDKGatewayResponse.Listener<CommissionsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.commissionsModel());
    }

    @Override
    public void transferNationalCommissionsDocument(TransferCommissionForm form,
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.documentModel());
    }

    @Override
    public void transferNationalDuplicated(TransferDuplicatedForm form,
            final IDKGatewayResponse.Listener<BooleanResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.booleanResponseModel());
    }

    @Override
    public void transfersList(TransfersForm form,
            final IDKGatewayResponse.Listener<TransfersListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.transferListModel());
    }

    @Override
    public void transferNationalPeriodicalCreate(PeriodicalTransferForm form,
            final IDKGatewayResponse.Listener<PeriodicalTransferResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.periodicalTransferResponseModel());
    }

    @Override
    public void transferNationalPeriodicalEndDate(PeriodicalTransferEndDateForm form,
            final IDKGatewayResponse.Listener<StringResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.periodicalTransferEndDateResponseModel());
    }

    // ########################################
    // Glass WebServices
    // ########################################
    @Override
    public void glassAgent(SessionAgentForm form,
            final IDKGatewayResponse.Listener<AgentSessionModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.agentSessionModel());
    }

    @Override
    public void glassAgentAccounts(SessionAccountsForm form,
            final IDKGatewayResponse.Listener<SessionAgentAccountsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.sessionAgentAccounts());
    }

    @Override
    public void glassAccounts(SessionAccountsForm form,
            final IDKGatewayResponse.Listener<SessionAccountsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.sessionAccounts());
    }

    @Override
    public void glassAccountsMovements(SessionAccountMovementsForm form,
            final IDKGatewayResponse.Listener<SessionAccountMovementsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.sessionAccountMovementModel());
    }

    // ########################################
    // Wallet WebServices
    // ########################################
    @Override
    public void nfcSession(NfcSessionForm form,
            final IDKGatewayResponse.Listener<NfcSessionModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.nfcSessionModel());
    }

    @Override
    public void nfcSignupCard(NfcSignUpUnsubscribeForm form,
            final IDKGatewayResponse.Listener<NfcSignUpCardModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.nfcSignUpCardModel());
    }

    @Override
    public void nfcSignupCardDelete(NfcSignUpUnsubscribeForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(null);
    }

    // ########################################
    // Html plugins methods
    // ########################################

    @Override
    public void downloadPdf(String url, String params, String httpMethod,
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.documentModel());
    }

    @Override
    public void htmlToNativeRequest(String url, String method, String body, Map<String, String>
            headers, final IDKGatewayResponse.Listener<NativeResponse> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        responseListener.onResponse(MockFactory.getNativeResponse());
    }
}

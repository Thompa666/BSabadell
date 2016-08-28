package com.ideaknow.api.client;

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
import com.ideaknow.api.client.gateway.IDKGateway;
import com.ideaknow.api.client.gateway.IDKGatewayResponse;
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

public class SabadellApi {

    public static final String SLASH = "/";
    private String URL = "http://www.bancsabadell.mobi:443";
    private static String nameEnv = "";
    private static String language;

    //Constant to update API version
    public static String ACCEPT_VALUE = "application/vnd.idk.bsmobil-v1640+json";

    // WebServices paths.
    private static final String URL_SESSION_WS = "/session";
    private static final String URL_ACCOUNTS_WS = "/accounts";
    private static final String URL_ACTIVATION_WS = "/activation";
    private static final String URL_AGENT_WS = "/agent";
    private static final String URL_ACTIVEAGENT_WS = "/activeagent";
    private static final String URL_ALERTS_WS = "/alerts";
    private static final String URL_ALIAS_WS = "/alias";
    private static final String URL_AMOUNTS_WS = "/amounts";
    private static final String URL_ANONYMOUS_WS = "/anonymous";
    private static final String URL_ASSIGNED_WS = "/assigned";
    private static final String URL_ATM = "/atmmobile";
    private static final String URL_AVAILABLE_WS = "/available";
    public static final String URL_BANKS_WS = "/banks";
    public static final String URL_BANNER_WS = "/banner";
    private static final String URL_BENEFICIARIES_WS = "/beneficiaries";
    public static final String URL_BIC_WS = "/bic";
    private static final String URL_BLACKLIST_WS = "/blacklist";
    private static final String URL_BLOCK_WS = "/block";
    private static final String URL_CANCEL_WS = "/cancel";
    private static final String URL_CARDS_WS = "/cards";
    public static final String URL_CITIES_WS = "/cities";
    private static final String URL_CARDS_PIN_RECOVERY = "/recoverypin";
    private static final String URL_CARDTOACCOUNT_WS = "/cardtoaccount";
    private static final String URL_CHANGEPIN_WS = "/changepin";
    private static final String URL_CHANGEREQUEST_WS = "/changerequest";
    private static final String URL_CHECKS_WS = "/checks";
    private static final String URL_CHECKS_INSTANT_WS = "/instant";
    private static final String URL_CLICK_TO_CALL_WS = "/clicktocall";
    private static final String URL_CONDITIONS_WS = "/conditions";
    private static final String URL_COMMISSION_WS = "/commission";
    private static final String URL_COMMISSIONS_WS = "/commissions";
    private static final String URL_COMPANIES_WS = "/companies";
    private static final String URL_CONDITION_WS = "/condition";
    private static final String URL_CONTACT_DATA_WS = "/contactdata";
    private static final String URL_CONTRACT_WS = "/contract";
    private static final String URL_CONTRACTS_WS = "/contracts";
    private static final String URL_COUNTRIES_WS = "/countries";
    private static final String URL_CREDIT_LIMIT_WS = "/creditlimit";
    private static final String URL_DEBIT_LIMIT_WS = "/debitlimit";
    private static final String URL_CREDIT_LIMITS_WS = "/creditlimits";
    private static final String URL_CREDITSPLIT_WS = "/creditsplit";
    private static final String URL_CURRENCIES_WS = "/currencies";
    private static final String URL_DEBITSPLIT_WS = "/debitsplit";
    private static final String URL_DELETE_WS = "/delete";
    private static final String URL_DEVICE_WS = "/device";
    private static final String URL_DEVICES_WS = "/devices";
    private static final String URL_DIRECTDEBITS_WS = "/directdebits";
    private static final String URL_DOCUMENT_WS = "/document";
    private static final String URL_DOLLAR_DATES_WS = "/dollardates";
    private static final String URL_DUPLICATED_WS = "/duplicated";
    private static final String URL_EMAIL_WS = "/email";
    private static final String URL_ENDDATE_WS = "/enddate";
    private static final String URL_ENROLLMENTS_WS = "/enrollments";
    private static final String URL_ENROLLMENT_WS = "/enrollment";
    private static final String URL_GENERAL_WS = "/general";
    private static final String URL_GEOPOINT_WS = "/geopoint";
    private static final String URL_INBOX_WS = "/inboxes";
    private static final String URL_INFORMATIONAL_WS = "/informational";
    private static final String URL_INSTANT_MONEY_WS = "/instantmoney";
    private static final String URL_INTERNATIONAL_WS = "/international";
    private static final String URL_KEYS_WS = "/keys";
    private static final String URL_MAILS_WS = "/mails";
    private static final String URL_LAST_WS = "/last";
    private static final String URL_MERCHANTS_WS = "/merchants";
    private static final String URL_MENU_WS = "/menu";
    private static final String URL_MESSAGE_WS = "/message";
    private static final String URL_MESSAGES_WS = "/messages";
    private static final String URL_MOBILE_WS = "/mobile";
    private static final String URL_MOVEMENTS_WS = "/movements";
    private static final String URL_MYAVAILABILITY_WS = "/myavailability";
    private static final String URL_NAMING_LIST = "/naminglist";
    private static final String URL_NATIONAL_WS = "/national";
    private static final String URL_NOSESSIONINBOX_WS = "/nosessioninbox";
    private static final String URL_NOSESSIONNOTIFICATIONS_WS = "/nosessionnotifications";
    private static final String URL_NOSESSIONTPC_WS = "/nosessiontpc/tpc";
    private static final String URL_NOTIFICATIONS_WS = "/notifications";
    private static final String URL_OFFICES_WS = "/offices";
    private static final String URL_OPERATION_WS = "/operation";
    private static final String URL_OPERATIONS_WS = "/operations";
    private static final String URL_OTP_WS = "/otp";
    private static final String URL_PAYERS_WS = "/payers";
    private static final String URL_PDF_WS = "/pdf";
    private static final String URL_PERIODS_WS = "/periods";
    private static final String URL_PERIODICAL_WS = "/periodical";
    private static final String URL_PERIODICALS_WS = "/periodicals";
    private static final String URL_PREPAID_WS = "/prepaid";
    private static final String URL_PRODUCT_WS = "/product";
    private static final String URL_PRODUCTS_WS = "/products";
    private static final String URL_PROFILES_WS = "/profiles";
    private static final String URL_PROMOLAYER_WS = "/promolayer";
    private static final String URL_PUSH_WS = "/push";
    private static final String URL_RELOAD_WS = "/reload";
    private static final String URL_REFUND_WS = "/refund";
    private static final String URL_RETURNBILL_WS = "/returnbill";
    private static final String URL_RULES_WS = "/rules";
    private static final String URL_SPECIFIC_WS = "/specific";
    private static final String URL_SETTLEMENTS_WS = "/settlements";
    private static final String URL_SECOND_KEY_WS = "/secondkey";
    private static final String URL_STATUS_WS = "/status";
    private static final String URL_STICKER_WS = "/sticker";
    private static final String URL_REFRESH_WS = "/refresh";
    private static final String URL_RISK_RECORDS_WS = "/riskrecords";
    private static final String URL_TERMINALS_WS = "/terminals";
    private static final String URL_TPC_WS = "/tpc";
    public static final String URL_TPC_UPDATE_PROCESS_PAGE1 = "/page1";
    public static final String URL_TPC_UPDATE_PROCESS_PAGE2 = "/page2";
    private static final String URL_TPV_WS = "/tpv";
    private static final String URL_TRANSACTION_MONITORING_WS = "/tmkey";
    private static final String URL_TRANSFERS_WS = "/transfers";
    private static final String URL_TRANSFERS_OWN_WS = "/own";
    private static final String URL_TRANSFER_TO_CARD_WS = "/accounttocard";
    private static final String URL_UNCONFIRMED_WS = "/unconfirmed";
    private static final String URL_UPDATE_PROCESS = "/updateprocess";
    private static final String URL_WALLET_WS = "/wallet";
    private static final String URL_SERVICE_HEALTH = "/servicehealth";
    // Glass WebServices paths.
    private static final String URL_GG = "/glass";
    private static final String URL_AGENT_ACCOUNTS = "/agentaccounts";

    // Wallet WebServices paths.
    private static final String URL_NFC = "/nfc";
    private static final String URL_NFC_SIGNUPCARD = "/signupcard";

    // WebServices urls.
    public static String sSessionUrl;

    public static String sAccountTransferToCard;
    public static String sAccountsAlias;
    public static String sAccountsUrl;
    public static String sAccountsMovementsUrl;
    public static String sAccountsMovementsDocumentUrl;
    public static String sAccountsMovementsReturnBillUrl;
    public static String sAccountsMovementsSplitUrl;
    public static String sAccountsPayers;
    public static String sActiveAgent;
    public static String sActiveAgentMyAvailability;
    public static String sAgent;
    public static String sAgentAvailable;
    public static String sAlerts;
    public static String sAlertsContracts;
    public static String sAtm;
    public static String sAtmCommissions;
    public static String sAtmCreate;
    public static String sAtmCreateOTP;
    public static String sAtmEnrollments;
    public static String sAtmRemoveOTP;
    public static String sBannerProductUrl;
    public static String sBannerWalletUrl;
    public static String sBlacklistUrl;
    public static String sCardsActivationUrl;
    public static String sCardsActivationConditionsSpecificUrl;
    public static String sCardsActivationConditionsGeneralUrl;
    public static String sCardBlocklUrl;
    public static String sCardMovementsUrl;
    public static String sCardMovementsGeopointUrl;
    public static String sCardMovementsUnconfirmedUrl;
    public static String sCardMovementsUnconfirmedLastUrl;
    public static String sCardPinRecovery;
    public static String sCardPrepaidReloadAmounts;
    public static String sCardPrepaidReloadCommissions;
    public static String sCardPrepaidReload;
    public static String sCardSettlementsUrl;
    public static String sCardSettlementsDocumentUrl;
    public static String sCardStickerUrl;
    public static String sCardToAccountUrl;
    public static String sCardsAlias;
    public static String sCardsUrl;
    public static String sCardsConditionsUrl;
    public static String sChangePinUrl;
    public static String sClickToCallUrl;
    public static String sContractsUrl;
    public static String sCompaniesUrl;
    public static String sCompaniesCreditLimits;
    public static String sCompaniesCreditLimitsAssigned;
    public static String sCompaniesCreditLimitsCondition;
    public static String sContactDataUrl;
    public static String sContactDataPdfUrl;
    public static String sContactDataUpdateEmailUrl;
    public static String sCountriesUrl;
    public static String sCreditLimitUrl;
    public static String sDebitLimitUrl;
    public static String sCreditSplitUrl;
    public static String sCreditSplitPeriodUrl;
    public static String sDebitSplitUrl;
    public static String sDebitSplitPeriodUrl;
    public static String sDeviceUrl;
    public static String sDevicesUrl;
    public static String sDirectDebitUrl;
    public static String sInboxUrl;
    public static String sInformationalUrl;
    public static String sInstantCashCommissionUrl;
    public static String sInstantCheckUrl;
    public static String sInstantCheckOcrUrl;
    public static String sInstantMoney;
    public static String sInstantMoneyActivation;
    public static String sInstantMoneyCommissions;
    public static String sMailsUrl;
    public static String sMailsDocumentUrl;
    public static String sMenuUrl;
    public static String sMessageUrl;
    public static String sMessagesUrl;
    public static String sMessagesRemoveUrl;
    public static String sNamingList;
    public static String sNosessionInbox;
    public static String sNosessionInboxEnrollmentUrl;
    public static String sNosessionInboxEnrollmentsUrl;
    public static String sNosessionInboxMessageUrl;
    public static String sNosessionInboxMessageDeleteUrl;
    public static String sNosessionInboxMessagesUrl;
    public static String sNosessionInboxUnenrollmentUrl;
    public static String sNosessionNotificationsUrl;
    public static String sNosessionTpcUrl;
    public static String sNotificationUrl;
    public static String sOfficesUrl;
    public static String sProductsUrl;
    public static String sProductsCardsUrl;
    public static String sProfilesUrl;
    public static String sProfilesCountriesUrl;
    public static String sProfilesRulesUrl;
    public static String sPromoLayerUrl;
    public static String sPromoLayerAvailableUrl;
    public static String sPushUrl;
    public static String sPushContractUrl;
    public static String sPushContractsUrl;
    public static String sPushDeviceUrl;
    public static String sPushDevicesUrl;
    public static String sPushDeviceRemoveUrl;
    public static String sSecondKeyUrl;
    public static String sSessionAnonymousUrl;
    public static String sStatusUrl;
    public static String sRefreshUrl;
    public static String sRiskRecordsUrl;
    public static String sTpcUrl;
    public static String sTpcEnrollmentsUrl;
    public static String sTpcEnrollmentUrl;
    public static String sTpcKeysUrl;
    public static String sTpcMobileUrl;
    public static String sTpcUpdateProcess;
    public static String sTpcUpdateProcessPage1;
    public static String sTpcUpdateProcessPage2;
    public static String sTpcOtp;
    public static String sTpvUrl;
    public static String sTpvMerchantsUrl;
    public static String sTpvMerchantsTerminalsUrl;
    public static String sTpvOperationsUrl;
    public static String sTpvOperationsOperationUrl;
    public static String sTpvOperationsRefundUrl;
    public static String sTpvOperationsOperationStatusUrl;
    public static String sTransactionMonitoringUrl;
    public static String sTransfersInternationalUrl;
    public static String sTransfersInternationalBeneficiariesUrl;
    public static String sTransfersInternationalBeneficiariesDeleteUrl;
    public static String sTransfersInternationalCommissionsUrl;
    public static String sTransfersInternationalCountriesUrl;
    public static String sTransfersInternationalCurrenciesUrl;
    public static String sTransfersInternationalDollarDatesUrl;
    public static String sTransfersNationalUrl;
    public static String sTransfersNationalBeneficiariesUrl;
    public static String sTransfersNationalBeneficiariesDeleteUrl;
    public static String sTransfersNationalCommissionsUrl;
    public static String sTransferUrl;
    public static String sTransferCancelUrl;
    public static String sTransferCancelConditionsDocument;
    public static String sTransferOwnUrl;
    public static String sTransferOwnConditionsDocumentUrl;
    public static String sTransfersNationalCommissionsDocumentUrl;
    public static String sTransfersNationalDuplicatedUrl;
    public static String sTransfersNationalPeriodicalsCreateUrl;
    public static String sTransfersNationalPeriodicalsEndDateUrl;
    public static String sServiceHealth;
    // Glass WebServices urls.
    public static String sGlass;
    public static String sGlassAgent;
    public static String sGlassAgentAccounts;
    public static String sGlassAccounts;
    public static String sGlassAccountsMovements;

    // Wallet WebServices urls.
    public static String sWalletNfc;
    public static String sWalletNfcSession;
    public static String sWalletNfcSignupCard;
    public static String sWalletNfcSignupCardDelete;

    private IDKGateway mGateway;

    public SabadellApi(IDKGateway gateway) {
        mGateway = gateway;

        createUrls();
    }

    public String getUrl() {
        return URL;
    }

    public void setUrl(String urlPath) {
        URL = urlPath;
        createUrls();
    }

    public String getUrlStaticResources() {
        return URL.replace("/api", "");
    }

    private void createUrls() {
        sSessionUrl = URL + URL_SESSION_WS;
        sAccountsUrl = URL + URL_ACCOUNTS_WS;
        sAccountsAlias = sAccountsUrl + URL_ALIAS_WS;
        sAccountsMovementsUrl = sAccountsUrl + URL_MOVEMENTS_WS;
        sAccountsMovementsDocumentUrl = sAccountsMovementsUrl + URL_DOCUMENT_WS;
        sAccountsMovementsReturnBillUrl = sAccountsMovementsUrl + URL_RETURNBILL_WS;
        sAccountsMovementsSplitUrl = sAccountsMovementsUrl + URL_DEBITSPLIT_WS;
        sAccountsPayers = sAccountsUrl + URL_PAYERS_WS;
        sAccountTransferToCard = URL + URL_TRANSFERS_WS + URL_TRANSFER_TO_CARD_WS;
        sActiveAgent = URL + URL_ACTIVEAGENT_WS;
        sActiveAgentMyAvailability = sActiveAgent + URL_MYAVAILABILITY_WS;
        sAgent = URL + URL_AGENT_WS;
        sAgentAvailable = sAgent + URL_AVAILABLE_WS;
        sAlerts = URL + URL_ALERTS_WS;
        sAlertsContracts = sAlerts + URL_CONTRACTS_WS;
        sAtm = URL + URL_ATM;
        sAtmCommissions = sAtm + URL_COMMISSIONS_WS;
        sAtmCreate = sAtm + URL_ENROLLMENTS_WS + URL_ENROLLMENT_WS;
        sAtmCreateOTP = sAtm + URL_OTP_WS;
        sAtmEnrollments = sAtm + URL_ENROLLMENTS_WS;
        sAtmRemoveOTP = sAtm + URL_OTP_WS + URL_DELETE_WS;
        sBannerProductUrl = URL + URL_BANNER_WS + URL_PRODUCT_WS;
        sBannerWalletUrl = URL + URL_BANNER_WS + URL_WALLET_WS;
        sBlacklistUrl = URL + URL_BLACKLIST_WS;
        sCardsUrl = URL + URL_CARDS_WS;
        sCardsAlias = sCardsUrl + URL_ALIAS_WS;
        sCardsActivationUrl = sCardsUrl + URL_ACTIVATION_WS;
        sCardsActivationConditionsGeneralUrl = sCardsUrl + URL_ACTIVATION_WS +
                URL_CONDITION_WS + URL_GENERAL_WS;
        sCardsActivationConditionsSpecificUrl = sCardsUrl + URL_ACTIVATION_WS +
                URL_CONDITION_WS + URL_SPECIFIC_WS;
        sCardBlocklUrl = sCardsUrl + URL_BLOCK_WS;
        sCardsConditionsUrl = sCardsUrl + URL_CONDITIONS_WS;
        sCardMovementsUrl = sCardsUrl + URL_MOVEMENTS_WS;
        sCardMovementsGeopointUrl = sCardMovementsUrl + URL_GEOPOINT_WS;
        sCardMovementsUnconfirmedUrl = sCardMovementsUrl + URL_UNCONFIRMED_WS;
        sCardMovementsUnconfirmedLastUrl = sCardMovementsUnconfirmedUrl + URL_LAST_WS ;
        sCardPinRecovery = sCardsUrl + URL_CARDS_PIN_RECOVERY;
        sCardPrepaidReload = sCardsUrl + URL_PREPAID_WS + URL_RELOAD_WS;
        sCardPrepaidReloadAmounts = sCardPrepaidReload + URL_AMOUNTS_WS;
        sCardPrepaidReloadCommissions = sCardPrepaidReload + URL_COMMISSIONS_WS;
        sCardSettlementsUrl = sCardsUrl + URL_SETTLEMENTS_WS;
        sCardSettlementsDocumentUrl = sCardSettlementsUrl + URL_DOCUMENT_WS;
        sCardStickerUrl = sCardsUrl + URL_STICKER_WS;
        sCardToAccountUrl = URL + URL_TRANSFERS_WS + URL_CARDTOACCOUNT_WS;
        sChangePinUrl = URL + URL_CHANGEPIN_WS;
        sClickToCallUrl = URL + URL_CLICK_TO_CALL_WS;
        sContractsUrl = sSessionUrl + URL_CONTRACTS_WS;
        sCompaniesUrl = URL + URL_COMPANIES_WS;
        sCompaniesCreditLimits = sCompaniesUrl + URL_CREDIT_LIMITS_WS;
        sCompaniesCreditLimitsAssigned = sCompaniesCreditLimits + URL_ASSIGNED_WS;
        sCompaniesCreditLimitsCondition = sCompaniesCreditLimits + URL_CONDITION_WS;
        sContactDataUrl = URL + URL_CONTACT_DATA_WS;
        sContactDataPdfUrl = sContactDataUrl + URL_PDF_WS;
        sContactDataUpdateEmailUrl = sContactDataUrl + URL_EMAIL_WS;
        sCountriesUrl = URL + URL_COUNTRIES_WS;
        sCreditLimitUrl = URL + URL_CARDS_WS + URL_CREDIT_LIMIT_WS;
        sDebitLimitUrl = URL + URL_CARDS_WS + URL_DEBIT_LIMIT_WS;
        sCreditSplitUrl = sCardMovementsUrl + URL_CREDITSPLIT_WS;
        sCreditSplitPeriodUrl = sCreditSplitUrl + URL_PERIODS_WS;
        sDebitSplitUrl = sCardMovementsUrl + URL_DEBITSPLIT_WS;
        sDebitSplitPeriodUrl = sDebitSplitUrl + URL_PERIODS_WS;
        sDevicesUrl = URL + URL_PUSH_WS + URL_DEVICES_WS;
        sDeviceUrl = sDevicesUrl + URL_DEVICE_WS;
        sDirectDebitUrl = URL + URL_DIRECTDEBITS_WS;
        sInboxUrl = URL + URL_INBOX_WS;
        sInformationalUrl = URL + URL_INFORMATIONAL_WS;
        sInstantCashCommissionUrl = sCardToAccountUrl + URL_COMMISSION_WS;
        sInstantCheckUrl = URL + URL_CHECKS_WS;
        sInstantCheckOcrUrl = sInstantCheckUrl + URL_CHECKS_INSTANT_WS;
        sInstantMoney = URL + URL_INSTANT_MONEY_WS;
        sInstantMoneyActivation = sInstantMoney + URL_ACTIVATION_WS;
        sInstantMoneyCommissions = sInstantMoney + URL_COMMISSIONS_WS;
        sMailsUrl = URL + URL_MAILS_WS;
        sMailsDocumentUrl = sMailsUrl + URL_DOCUMENT_WS;
        sMenuUrl = URL + URL_MENU_WS;
        sMessagesUrl = URL + URL_PUSH_WS + URL_MESSAGES_WS;
        sMessageUrl = sMessagesUrl + URL_MESSAGE_WS;
        sMessagesRemoveUrl = sMessageUrl + URL_DELETE_WS;
        sNamingList = URL + URL_NAMING_LIST;
        sNosessionInbox = URL + URL_NOSESSIONINBOX_WS;
        sNosessionInboxEnrollmentUrl = sNosessionInbox + URL_ENROLLMENTS_WS +
                URL_ENROLLMENT_WS;
        sNosessionInboxEnrollmentsUrl = sNosessionInbox + URL_ENROLLMENTS_WS;
        sNosessionInboxMessagesUrl = sNosessionInbox + URL_MESSAGES_WS;
        sNosessionInboxMessageDeleteUrl = sNosessionInboxMessageUrl + URL_DELETE_WS;
        sNosessionInboxMessageUrl = sNosessionInboxMessagesUrl + URL_MESSAGE_WS;
        sNosessionInboxUnenrollmentUrl = sNosessionInboxEnrollmentUrl + URL_DELETE_WS;
        sNosessionNotificationsUrl = URL + URL_NOSESSIONNOTIFICATIONS_WS;
        sNosessionTpcUrl = URL + URL_NOSESSIONTPC_WS;
        sNotificationUrl = URL + URL_NOTIFICATIONS_WS;
        sOfficesUrl = URL + URL_OFFICES_WS;
        sProductsUrl = URL + URL_PRODUCTS_WS;
        sProductsCardsUrl = sProductsUrl + URL_CARDS_WS;
        sProfilesUrl = sCardsUrl + URL_PROFILES_WS;
        sProfilesCountriesUrl = sProfilesUrl + URL_COUNTRIES_WS;
        sProfilesRulesUrl = sProfilesUrl + URL_RULES_WS;
        sPromoLayerUrl = URL + URL_PROMOLAYER_WS;
        sPromoLayerAvailableUrl = sPromoLayerUrl + SLASH + PromoLayerAvailableForm
                .PROMOLAYER_CODE + URL_AVAILABLE_WS;
        sPushUrl = URL + URL_PUSH_WS;
        sPushContractUrl = sPushUrl + URL_CONTRACT_WS;
        sPushContractsUrl = sAlerts + URL_CONTRACTS_WS;
        sPushDevicesUrl = sPushUrl + URL_DEVICES_WS;
        sPushDeviceUrl = sPushDevicesUrl + URL_DEVICE_WS;
        sPushDeviceRemoveUrl = sPushDeviceUrl + URL_DELETE_WS;
        sRefreshUrl = sDeviceUrl + URL_REFRESH_WS;
        sRiskRecordsUrl = URL + URL_RISK_RECORDS_WS;
        sSecondKeyUrl = URL + URL_SECOND_KEY_WS;
        sSessionAnonymousUrl = sSessionUrl + URL_ANONYMOUS_WS;
        sStatusUrl = URL + URL_STATUS_WS;
        sTpcUrl = URL + URL_TPC_WS;
        sTpcKeysUrl = sTpcUrl + URL_KEYS_WS;
        sTpcMobileUrl = sTpcUrl + URL_MOBILE_WS;
        sTpcEnrollmentsUrl = sTpcUrl + URL_ENROLLMENTS_WS;
        sTpcEnrollmentUrl = sTpcEnrollmentsUrl + URL_ENROLLMENT_WS;
        sTpcUpdateProcess = sTpcUrl + URL_UPDATE_PROCESS;
        sTpcUpdateProcessPage1 = sTpcUpdateProcess + URL_TPC_UPDATE_PROCESS_PAGE1;
        sTpcUpdateProcessPage2 = sTpcUpdateProcess + URL_TPC_UPDATE_PROCESS_PAGE2;
        sTpcOtp = URL + URL_TPC_WS + URL_OTP_WS;
        sTpvUrl = URL + URL_TPV_WS;
        sTpvMerchantsUrl = sTpvUrl + URL_MERCHANTS_WS;
        sTpvMerchantsTerminalsUrl = sTpvUrl + URL_TERMINALS_WS;
        sTpvOperationsUrl = URL + URL_TPV_WS + URL_OPERATIONS_WS;
        sTpvOperationsOperationUrl = sTpvOperationsUrl + URL_OPERATION_WS;
        sTpvOperationsOperationStatusUrl = sTpvOperationsOperationUrl + URL_STATUS_WS;
        sTpvOperationsRefundUrl = sTpvOperationsUrl + URL_REFUND_WS;
        sTransactionMonitoringUrl = URL + URL_TRANSACTION_MONITORING_WS;
        sTransferUrl = URL + URL_TRANSFERS_WS;
        sTransferCancelUrl = sTransferUrl + URL_CANCEL_WS;
        sTransferCancelConditionsDocument = sTransferUrl + URL_CONDITIONS_WS + URL_CANCEL_WS
                + URL_DOCUMENT_WS;
        sTransfersInternationalUrl = sTransferUrl + URL_INTERNATIONAL_WS;
        sTransfersInternationalBeneficiariesUrl = sTransfersInternationalUrl + URL_BENEFICIARIES_WS;
        sTransfersInternationalBeneficiariesDeleteUrl = sTransfersInternationalBeneficiariesUrl +
                URL_DELETE_WS;
        sTransfersInternationalCommissionsUrl = sTransfersInternationalUrl + URL_COMMISSIONS_WS;
        sTransfersInternationalCountriesUrl = sTransfersInternationalUrl + URL_COUNTRIES_WS;
        sTransfersInternationalCurrenciesUrl = sTransfersInternationalUrl + URL_CURRENCIES_WS;
        sTransfersInternationalDollarDatesUrl = sTransfersInternationalUrl + URL_DOLLAR_DATES_WS;
        sTransfersNationalUrl = sTransferUrl + URL_NATIONAL_WS;
        sTransfersNationalBeneficiariesUrl = sTransfersNationalUrl + URL_BENEFICIARIES_WS;
        sTransfersNationalBeneficiariesDeleteUrl = sTransfersNationalBeneficiariesUrl +
                URL_DELETE_WS;
        sTransfersNationalCommissionsUrl = sTransfersNationalUrl + URL_COMMISSIONS_WS;
        sTransfersNationalCommissionsDocumentUrl = sTransferUrl + URL_CONDITIONS_WS +
                URL_DOCUMENT_WS;
        sTransfersNationalDuplicatedUrl = sTransfersNationalUrl + URL_DUPLICATED_WS;
        sTransfersNationalPeriodicalsCreateUrl = sTransfersNationalUrl + URL_PERIODICALS_WS +
                URL_PERIODICAL_WS;
        sTransfersNationalPeriodicalsEndDateUrl = sTransfersNationalPeriodicalsCreateUrl +
                URL_ENDDATE_WS;
        sTransferOwnUrl = sTransferUrl + URL_TRANSFERS_OWN_WS;
        sTransferOwnConditionsDocumentUrl = sTransferOwnUrl + URL_CONDITIONS_WS + URL_DOCUMENT_WS;

        sGlass = URL + URL_GG;
        sGlassAgent = sGlass + URL_AGENT_WS;
        sGlassAgentAccounts = sGlass + URL_AGENT_ACCOUNTS;
        sGlassAccounts = sGlass + URL_ACCOUNTS_WS;
        sGlassAccountsMovements = sGlassAccounts + URL_MOVEMENTS_WS;
        sServiceHealth = URL + URL_SERVICE_HEALTH;
        sWalletNfc = URL + URL_NFC;
        sWalletNfcSession = sWalletNfc + URL_SESSION_WS;
        sWalletNfcSignupCard = sWalletNfc + URL_NFC_SIGNUPCARD;
        sWalletNfcSignupCardDelete = sWalletNfcSignupCard + URL_DELETE_WS;
    }

    public void setCurrentLanguageHeader(String currentLanguage) {
        language = currentLanguage;
        mGateway.setCurrentAcceptLanguageHeaderValue(language);
    }

    public static String getCurrentLanguageHeader() {
        return language;
    }

    public void setGateway(IDKGateway gateway) {
        mGateway = gateway;
    }

    public void login(SessionForm form, final IDKGatewayResponse.Listener<SessionModel>
            responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.login(form, responseListener, errorListener);
    }

    public void logout(final IDKGatewayResponse.Listener<Void> listener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.logout(listener, errorListener);
    }

    public void accounts(AccountsForm form,
            final IDKGatewayResponse.Listener<AccountsListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.accounts(form, responseListener, errorListener);
    }

    public void accountsAlias(AccountForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.accountsAlias(form, responseListener, errorListener);
    }

    public void accountMovements(AccountMovementsForm form,
            final IDKGatewayResponse.Listener<AccountMovementsListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.accountMovements(form, responseListener, errorListener);
    }

    public void accountMovementReturnBill(AccountMovementReturnBillForm form,
            final IDKGatewayResponse.Listener<BooleanResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.accountMovementReturnBill(form, responseListener, errorListener);
    }

    public void accountMovementSplit(AccountMovementsDebitSplitForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.accountMovementSplit(form, responseListener, errorListener);
    }

    public void accountMovementsDocument(AccountMovementDocumentForm form,
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.accountMovementsDocument(form, responseListener, errorListener);
    }

    public void accountPayers(AccountPayersForm form,
            final IDKGatewayResponse.Listener<AccountPayersModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.accountPayers(form, responseListener, errorListener);
    }

    public void accountTransferToCard(TransferToCardForm form,
            final IDKGatewayResponse.Listener<AccountTransferToCardModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.accountTransferToCard(form, responseListener, errorListener);
    }

    public void activeAgentMyAvailability(MyAvailabilityForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.activeAgentMyAvailability(form, responseListener, errorListener);
    }

    public void agent(AgentForm form,
            final IDKGatewayResponse.Listener<AgentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.activeAgent(form, responseListener, errorListener);
    }

    public void agentAvailable(
            final IDKGatewayResponse.Listener<BooleanResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.agentAvailable(responseListener, errorListener);
    }

    public void alertContracts(final IDKGatewayResponse.Listener<AlertContractListModel>
            listener, final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.alertsContracts(listener, errorListener);
    }

    public void atmCommissions(AtmMobileCommissionForm form,
            final IDKGatewayResponse.Listener<AtmMobileCommissionListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.atmCommissions(form, responseListener, errorListener);
    }

    public void atmCreate(EnrollmentCreateForm form,
            final IDKGatewayResponse.Listener<AtmMobileEnrollmentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.atmCreate(form, responseListener, errorListener);
    }

    public void atmCreateOTP(OtpGenerationForm form,
            final IDKGatewayResponse.Listener<AtmMobileOtpModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.atmCreateOTP(form, responseListener, errorListener);
    }

    public void atmEnrollments(EnrollmentListForm form,
            final IDKGatewayResponse.Listener<AtmMobileEnrollmentListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.atmEnrollments(form, responseListener, errorListener);
    }

    public void atmRemoveOTP(OtpRemoveForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.atmRemoveOTP(form, responseListener, errorListener);
    }

    public void bannerProduct(BannerForm form,
            final IDKGatewayResponse.Listener<BannerModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.bannerProduct(form, responseListener, errorListener);
    }

    public void bannerWallet(BannerForm form,
            final IDKGatewayResponse.Listener<BannerModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.bannerWallet(form, responseListener, errorListener);
    }

    public void blacklist(final IDKGatewayResponse.Listener<BlackListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.blacklist(responseListener, errorListener);
    }

    public void cancelPendingRequests() {
        mGateway.cancelPendingRequests();
    }

    public void cards(String filter, PaginatorModel paginator,
            final IDKGatewayResponse.Listener<CardListModel> listener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.cards(filter, paginator, listener, errorListener);
    }

    public void cardsAlias(CardForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.cardsAlias(form, responseListener, errorListener);
    }

    public void cardActivation(CardActivationForm form,
            final IDKGatewayResponse.Listener<CardActivationModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.cardActivation(form, responseListener, errorListener);
    }

    public void cardActivationConditionGeneral(DocumentForm form,
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.cardActivationPdfGeneral(form, responseListener, errorListener);
    }

    public void cardActivationConditionSpecific(CardPDFConditionForm form,
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.cardActivationPdfSpecific(form, responseListener, errorListener);
    }

    public void cardBlock(CardBlockedForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.cardBlock(form, responseListener, errorListener);
    }

    public void cardConditions(CardConditionsForm form,
            final IDKGatewayResponse.Listener<CardConditionsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.cardConditions(form, responseListener, errorListener);
    }

    public void cardConditionsUpdate(CardConditionsUpdateForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.cardConditionsUpdate(form, responseListener, errorListener);
    }

    public void cardMovementGeopoint(CardMovementGeoPointForm form,
            final IDKGatewayResponse.Listener<CardMovementGeoPointModel> listener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.cardMovementGeopoint(form, listener, errorListener);
    }

    public void cardMovementsUnconfirmedLast(CardLastMovementForm form,
            final IDKGatewayResponse.Listener<CardLastMovementModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.cardMovementsUnconfirmedLast(form, responseListener, errorListener);
    }

    public void cardMovements(CardAllMovementsForm card,
            final IDKGatewayResponse.Listener<CardMovementsListModel> listener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.cardMovements(card, listener, errorListener);
    }

    public void cardMovementsCreditSplitPeriods(CardMovementsCreditSplitPeriodsForm form,
            final IDKGatewayResponse.Listener<CardMovementsCreditSplitPeriodsModel> listener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.cardMovementsCreditSplitPeriods(form, listener, errorListener);
    }

    public void cardMovementsCreditSplit(CardMovementsCreditSplitForm form,
            final IDKGatewayResponse.Listener<Void> listener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.cardMovementsCreditSplit(form, listener, errorListener);
    }

    public void cardMovementsDebitSplitPeriods(CardMovementsDebitSplitPeriodsForm form,
            final IDKGatewayResponse.Listener<CardMovementsDebitSplitPeriodsModel> listener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.cardMovementsDebitSplitPeriods(form, listener, errorListener);
    }

    public void cardMovementsDebitSplit(CardMovementsDebitSplitForm form,
            final IDKGatewayResponse.Listener<Void> listener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.cardMovementsDebitSplit(form, listener, errorListener);
    }

    public void cardPinRecovery(CardSecondKeyForm form,
            final IDKGatewayResponse.Listener<StringResponseModel> listener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.cardPinRecovery(form, listener, errorListener);
    }

    public void cardPrepaidReload(CardPrepaidReloadForm form,
            final IDKGatewayResponse.Listener<Void> listener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.cardPrepaidReload(form, listener, errorListener);
    }

    public void cardPrepaidReloadAmounts(CardForm form,
            final IDKGatewayResponse.Listener<CardPrepaidReloadAmountsModel> listener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.cardPrepaidReloadAmounts(form, listener, errorListener);
    }

    public void cardPrepaidReloadCommissions(CardPrepaidReloadCommissionsForm form,
            final IDKGatewayResponse.Listener<CardPrepaidReloadCommissionsModel> listener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.cardPrepaidReloadCommissions(form, listener, errorListener);
    }

    public void cardProfiles(CardForm form,
            final IDKGatewayResponse.Listener<CardProfileRulesListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.cardProfiles(form, responseListener, errorListener);
    }

    public void cardProfilesCountries(
            final IDKGatewayResponse.Listener<CardProfileCountriesListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.cardProfilesCountries(responseListener, errorListener);
    }

    public void cardProfilesRules(CardProfileForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.cardProfilesRules(form, responseListener, errorListener);
    }

    public void cardSettlements(CardSettlementsForm form,
            final IDKGatewayResponse.Listener<CardSettlementsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.cardSettlements(form, responseListener, errorListener);
    }

    public void cardSettlementDocument(CardSettlementDocForm form,
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.cardSettlementDoc(form, responseListener, errorListener);
    }

    public void cardSticker(CardStickerForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.cardSticker(form, responseListener, errorListener);
    }

    public void changePin(ChangePinForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.changePin(form, responseListener, errorListener);
    }

    public void clickToCall(ClickToCallForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.clickToCall(form, responseListener, errorListener);
    }

    public void contracts(UserForm form,
            final IDKGatewayResponse.Listener<ContractListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.contracts(form, responseListener, errorListener);
    }

    public void companies(CompanyForm form,
            final IDKGatewayResponse.Listener<CompaniesListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.companies(form, responseListener, errorListener);
    }

    public void companyCreditLimits(LimitForm form,
            final IDKGatewayResponse.Listener<CompanyCreditLimitsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.companyCreditLimits(form, responseListener, errorListener);
    }

    public void companyCreditLimitsAssigned(LimitAssignedForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.companyCreditLimitsAssigned(form, responseListener, errorListener);
    }

    public void companyCreditLimitsConditions(
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.companyCreditLimitsConditions(responseListener, errorListener);
    }

    public void contactDataUpdateEmail(UpdateEmailForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.contactDataUpdateEmail(form, responseListener, errorListener);
    }

    public void contactDataUpdateEmailPdf(
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.contactDataUpdateEmailPdf(responseListener, errorListener);
    }

    public void countries(
            final IDKGatewayResponse.Listener<CountriesListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.countries(responseListener, errorListener);
    }

    public void creditLimit(CardLimitForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.creditLimit(form, responseListener, errorListener);
    }

    public void debitLimit(CardLimitForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.debitLimit(form, responseListener, errorListener);
    }

    public void directDebit(DirectDebitListForm form,
            final IDKGatewayResponse.Listener<DirectDebitListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.directDebit(form, responseListener, errorListener);
    }

    public void directDebitUpdate(DirectDebitForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.directDebitUpdate(form, responseListener, errorListener);
    }

    public void inbox(InboxForm form,
            final IDKGatewayResponse.Listener<InboxesModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.inbox(form, responseListener, errorListener);
    }

    public void informational(InformationalForm form,
             final IDKGatewayResponse.Listener<InformationalModel> responseListener,
             final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.informational(form, responseListener, errorListener);
    }

    public void instantCashCommission(CardToAccountCommissionForm form,
            final IDKGatewayResponse.Listener<CardToAccountCommissionModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.instantCashCommission(form, responseListener, errorListener);
    }

    public void instantCashTransfer(CardToAccountTransferForm form,
            final IDKGatewayResponse.Listener<CardToAccountTransferModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.instantCashTransfer(form, responseListener, errorListener);
    }

    public void instantCheck(CheckForm form,
            final IDKGatewayResponse.Listener<CheckModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.instantCheck(form, responseListener, errorListener);
    }

    public void instantCheckOcr(CheckInstantForm form,
            final IDKGatewayResponse.Listener<CheckModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.instantCheckOcr(form, responseListener, errorListener);
    }

    public void instantMoney(InstantMoneyForm form,
            final IDKGatewayResponse.Listener<InstantMoneyModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.instantMoney(form, responseListener, errorListener);
    }

    public void instantMoneyActivation(InstantMoneyActivationForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.instantMoneyActivation(form, responseListener, errorListener);
    }

    public void instantMoneyCommissions(InstantMoneyCommissionsForm form,
            final IDKGatewayResponse.Listener<InstantMoneyCommissionsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.instantMoneyCommissions(form, responseListener, errorListener);
    }

    public void mailDocument(MailDocumentForm form,
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.mailDocument(form, responseListener, errorListener);
    }

    public void mailList(MailListForm form,
            final IDKGatewayResponse.Listener<MailListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.mailList(form, responseListener, errorListener);
    }

    public void mailMarkAsRead(MailsForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.mailMarkAsRead(form, responseListener, errorListener);
    }

    public void menu(MenuForm form,
            final IDKGatewayResponse.Listener<MenuModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.menu(form, responseListener, errorListener);
    }

    public void message(PushMessageForm form,
            final IDKGatewayResponse.Listener<PushMessageModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.message(form, responseListener, errorListener);
    }

    public void messageList(PushMessageListForm form,
            final IDKGatewayResponse.Listener<PushMessageListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.messageList(form, responseListener, errorListener);
    }

    public void messageMarkAsRead(PushMessageActionForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.messageMarkAsRead(form, responseListener, errorListener);
    }

    public void messageRemove(PushMessageActionForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.messageRemove(form, responseListener, errorListener);
    }

    public void namingList(final IDKGatewayResponse.Listener<JSONObject> responselistener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.namingList(responselistener, errorListener);
    }

    public void noSessionInboxEnrollment(EnrollmentCreateForm form,
            final IDKGatewayResponse.Listener<AtmMobileEnrollmentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.noSessionInboxEnrollment(form, responseListener, errorListener);
    }

    public void noSessionInboxEnrollments(EnrollmentListForm form,
            final IDKGatewayResponse.Listener<AtmMobileEnrollmentListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.noSessionInboxEnrollments(form, responseListener, errorListener);
    }

    public void noSessionInboxMessage(NoSessionInboxForm form,
            final IDKGatewayResponse.Listener<PushMessageModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.noSessionInboxMessage(form, responseListener, errorListener);
    }

    public void noSessionInboxMessageDelete(NoSessionInboxActionForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.noSessionInboxMessageDelete(form, responseListener, errorListener);
    }

    public void noSessionInboxMessageMarkAsRead(NoSessionInboxActionForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.noSessionInboxMessageMarkAsRead(form, responseListener, errorListener);
    }

    public void noSessionInboxMessages(NoSessionInboxListForm form,
            final IDKGatewayResponse.Listener<PushMessageListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.noSessionInboxMessages(form, responseListener, errorListener);
    }

    public void noSessionInboxUnenrollment(EnrollmentRemoveForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.noSessionInboxUnenrollment(form, responseListener, errorListener);
    }

    public void noSessionNotifications(NoSessionNotificationsForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.noSessionNotifications(form, responseListener, errorListener);
    }

    public void noSessionTpc(NoSessionTpcSecondKeyForm form,
            final IDKGatewayResponse.Listener<KeyModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.noSessionTpc(form, responseListener, errorListener);
    }

    public void notification(NotificationForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.notification(form, responseListener, errorListener);
    }

    public void offices(OfficesSearchForm form,
            final IDKGatewayResponse.Listener<OfficeListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.offices(form, responseListener, errorListener);
    }

    public void otpTpcGeneration(OtpForm form,
            final IDKGatewayResponse.Listener<OtpQueryKeyModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.otpTpcGeneration(form, responseListener, errorListener);
    }

    public void ownTransfer(OwnTransferForm form,
            final IDKGatewayResponse.Listener<OwnTransferResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.ownTransfer(form, responseListener, errorListener);
    }

    public void ownTransferConditionsDocument(OwnTransferConditionsDocumentForm form,
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.ownTransferConditionsDocument(form, responseListener, errorListener);
    }

    public void products(final IDKGatewayResponse.Listener<ProductsListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.products(responseListener, errorListener);
    }

    public void productsCard(ProductsCardsForm form,
            final IDKGatewayResponse.Listener<ProductsCardsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.productsCards(form, responseListener, errorListener);
    }

    public void promolayer(PromoLayerForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.promolayer(form, responseListener, errorListener);
    }

    public void promolayerAvailable(PromoLayerAvailableForm form,
            final IDKGatewayResponse.Listener<PromoLayerResultModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.promolayerAvailable(form, responseListener, errorListener);
    }

    public void pushContract(PushCreationForm form,
            final IDKGatewayResponse.Listener<AlertContractModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.pushContract(form, responseListener, errorListener);
    }

    public void pushContracts(final IDKGatewayResponse.Listener<AlertContractListModel>
            responseListener, final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.pushContracts(responseListener, errorListener);
    }

    public void pushDeviceRegister(PushDeviceRegisterForm form,
            final IDKGatewayResponse.Listener<PushDeviceResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.pushDeviceRegister(form, responseListener, errorListener);
    }

    public void pushDeviceRemove(PushDeviceRegisterForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.pushDeviceRemove(form, responseListener, errorListener);
    }

    public void pushDevices(PushDeviceListForm form,
            final IDKGatewayResponse.Listener<PushDeviceListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.pushDevices(form, responseListener, errorListener);
    }

    public void pushDeviceRefreshRegister(PushDeviceRegisterForm form,
            final IDKGatewayResponse.Listener<PushDeviceResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.pushDeviceRefreshRegister(form, responseListener, errorListener);
    }

    public void riskRecords(RiskListForm form,
            final IDKGatewayResponse.Listener<RiskRecordListModel>
            responseListener, final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.riskRecords(form, responseListener, errorListener);
    }

    public void secondKey(SecondKeyForm form,
            final IDKGatewayResponse.Listener<KeyModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.secondKey(form, responseListener, errorListener);
    }

    public void sessionAnonymousLogin(SessionAnonymousForm form,
            final IDKGatewayResponse.Listener<UserModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.sessionAnonymousLogin(form, responseListener, errorListener);
    }

    public void sessionAnonymousLogout(final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.sessionAnonymousLogout(responseListener, errorListener);
    }

    public void status(String statusAppCode,
            final IDKGatewayResponse.Listener<StatusModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.status(statusAppCode, responseListener, errorListener);
    }

    public void tpcCreate(TpcEnrollmentCreateForm form,
            final IDKGatewayResponse.Listener<TpcKeyListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.tpcCreate(form, responseListener, errorListener);
    }

    public void tpcEnrollments(EnrollmentListForm form,
            final IDKGatewayResponse.Listener<AtmMobileEnrollmentListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.tpcEnrollments(form, responseListener, errorListener);
    }

    public void tpcKeys(TpcKeysOfflineForm form,
            final IDKGatewayResponse.Listener<TpcKeyListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.tpcKeys(form, responseListener, errorListener);
    }

    public void tpcMobile(TpcMobileForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.tpcMobile(form, responseListener, errorListener);
    }

    public void tpcMobileUpdate(TpcMobileForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.tpcMobileUpdate(form, responseListener, errorListener);
    }

    public void tpcSecondKey(TpcSecondKeyForm form,
            final IDKGatewayResponse.Listener<KeyModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.tpcSecondKey(form, responseListener, errorListener);
    }

    public void tpcUpdateProcessPage1(UpdateProcessPage1Form form,
            final IDKGatewayResponse.Listener<ContractResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.tpcUpdateProcessPage1(form, responseListener, errorListener);
    }

    public void tpcUpdateProcessPage2(UpdateProcessPage2Form form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.tpcUpdateProcessPage2(form, responseListener, errorListener);
    }

    public void tpvMerchants(MerchantsListForm form,
            final IDKGatewayResponse.Listener<MerchantListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.tpvMerchants(form, responseListener, errorListener);
    }

    public void tpvTerminals(TerminalsForm form,
            final IDKGatewayResponse.Listener<TerminalListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.tpvTerminals(form, responseListener, errorListener);
    }

    public void tpvOperations(OperationListForm form,
            final IDKGatewayResponse.Listener<TpvOperationListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.tpvOperations(form, responseListener, errorListener);
    }

    public void tpvOperationsOperation(NewOperationForm form,
            final IDKGatewayResponse.Listener<TpvOperationModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.tpvOperationsOperation(form, responseListener, errorListener);
    }

    public void tpvOperationsOperationStatus(OperationForm form,
            final IDKGatewayResponse.Listener<TpvOperationModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.tpvOperationsOperationStatus(form, responseListener, errorListener);
    }

    public void tpvOperationsRefund(OperationForm form,
            final IDKGatewayResponse.Listener<TpvOperationModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.tpvOperationsRefund(form, responseListener, errorListener);
    }

    public void transactionMonitoring(TransactionmonitoringForm form,
            final IDKGatewayResponse.Listener<KeyModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.transactionMonitoring(form, responseListener, errorListener);
    }

    public void transferCancel(TransferCancelForm form,
            final IDKGatewayResponse.Listener<TransferCancelModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.transferCancel(form, responseListener, errorListener);
    }

    public void transferCancelConditionsDocument(TransferCancelConditionsDocumentForm form,
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.transferCancelConditionsDocument(form, responseListener, errorListener);
    }

    public void transferInternational(TransferForm form,
            final IDKGatewayResponse.Listener<TransferResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.transferInternational(form, responseListener, errorListener);
    }

    public void transferInternationalBanks(TransferInternationalBicForm form,
            final IDKGatewayResponse.Listener<BanksModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.transferInternationalBanks(form, responseListener, errorListener);
    }

    public void transferInternationalBeneficiaries(
            final IDKGatewayResponse.Listener<BeneficiariesModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.transferInternationalBeneficiaries(responseListener, errorListener);
    }

    public void transferInternationalBeneficiariesCreate(BeneficiaryForm form,
            final IDKGatewayResponse.Listener<BeneficiaryResultModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.transferInternationalBeneficiariesCreate(form, responseListener, errorListener);
    }

    public void transferInternationalBeneficiariesDelete(BeneficiaryForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.transferInternationalBeneficiariesDelete(form, responseListener, errorListener);
    }

    public void transferInternationalBeneficiariesDetail(BeneficiaryForm form,
            final IDKGatewayResponse.Listener<BeneficiaryResultModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.transferInternationalBeneficiariesDetail(form, responseListener, errorListener);
    }

    public void transferInternationalBeneficiariesUpdate(BeneficiaryForm form,
            final IDKGatewayResponse.Listener<BeneficiaryResultModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.transferInternationalBeneficiariesUpdate(form, responseListener, errorListener);
    }

    public void transferInternationalBic(TransferInternationalBicForm form,
            final IDKGatewayResponse.Listener<BicsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.transferInternationalBic(form, responseListener, errorListener);
    }

    public void transferInternationalCities(TransferInternationalBicForm form,
            final IDKGatewayResponse.Listener<CitiesModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.transferInternationalCities(form, responseListener, errorListener);
    }

    public void transferInternationalCommissions(CommissionsForm form,
            final IDKGatewayResponse.Listener<CommissionsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.transferInternationalCommissions(form, responseListener, errorListener);
    }

    public void transferInternationalCountries(
            final IDKGatewayResponse.Listener<CountriesListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.transferInternationalCountries(responseListener, errorListener);
    }

    public void transferInternationalCurrencies(
            final IDKGatewayResponse.Listener<CurrenciesModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.transferInternationalCurrencies(responseListener, errorListener);
    }

    public void transferInternationalDollarDates(DollarDatesForm form,
            final IDKGatewayResponse.Listener<DollarDatesModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.transferInternationalDollarDates(form, responseListener, errorListener);
    }

    public void transferNational(TransferForm form,
            final IDKGatewayResponse.Listener<TransferResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.transferNational(form, responseListener, errorListener);
    }

    public void transferNationalBeneficiaries(
            final IDKGatewayResponse.Listener<BeneficiariesModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.transferNationalBeneficiaries(responseListener, errorListener);
    }

    public void transferNationalBeneficiariesCreate(BeneficiaryForm form,
            final IDKGatewayResponse.Listener<BeneficiaryResultModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.transferNationalBeneficiariesCreate(form, responseListener, errorListener);
    }

    public void transferNationalBeneficiariesDelete(BeneficiaryForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.transferNationalBeneficiariesDelete(form, responseListener, errorListener);
    }

    public void transferNationalBeneficiariesDetail(BeneficiaryForm form,
            final IDKGatewayResponse.Listener<BeneficiaryResultModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.transferNationalBeneficiariesDetail(form, responseListener, errorListener);
    }

    public void transferNationalBeneficiariesUpdate(BeneficiaryForm form,
            final IDKGatewayResponse.Listener<BeneficiaryResultModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.transferNationalBeneficiariesUpdate(form, responseListener, errorListener);
    }

    public void transferNationalCommissions(CommissionsForm form,
            final IDKGatewayResponse.Listener<CommissionsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.transferNationalCommissions(form, responseListener, errorListener);
    }

    public void transferNationalCommissionsDocument(TransferCommissionForm form,
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.transferNationalCommissionsDocument(form, responseListener, errorListener);
    }

    public void transferNationalDuplicated(TransferDuplicatedForm form,
            final IDKGatewayResponse.Listener<BooleanResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.transferNationalDuplicated(form, responseListener, errorListener);
    }

    public void transfersList(TransfersForm form,
            final IDKGatewayResponse.Listener<TransfersListModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.transfersList(form, responseListener, errorListener);
    }

    public void transferNationalPeriodicalCreate(PeriodicalTransferForm form,
            final IDKGatewayResponse.Listener<PeriodicalTransferResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.transferNationalPeriodicalCreate(form, responseListener, errorListener);
    }

    public void transferNationalPeriodicalEndDate(PeriodicalTransferEndDateForm form,
            final IDKGatewayResponse.Listener<StringResponseModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.transferNationalPeriodicalEndDate(form, responseListener, errorListener);
    }

    // ########################################
    // Glass WebServices
    // ########################################

    public void glassAgent(SessionAgentForm form,
            final IDKGatewayResponse.Listener<AgentSessionModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.glassAgent(form, responseListener, errorListener);
    }

    public void glassAgentAccounts(SessionAccountsForm form,
            final IDKGatewayResponse.Listener<SessionAgentAccountsModel>
                    responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.glassAgentAccounts(form, responseListener, errorListener);
    }

    public void glassAccounts(SessionAccountsForm form,
            final IDKGatewayResponse.Listener<SessionAccountsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.glassAccounts(form, responseListener, errorListener);
    }

    public void glassAccountsMovements(SessionAccountMovementsForm form,
            final IDKGatewayResponse.Listener<SessionAccountMovementsModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.glassAccountsMovements(form, responseListener, errorListener);
    }

    // ########################################
    // Wallet WebServices
    // ########################################
    public void nfcSession(NfcSessionForm form,
            final IDKGatewayResponse.Listener<NfcSessionModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.nfcSession(form, responseListener, errorListener);
    }

    public void nfcSignupCard(NfcSignUpUnsubscribeForm form,
            final IDKGatewayResponse.Listener<NfcSignUpCardModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.nfcSignupCard(form, responseListener, errorListener);
    }

    public void nfcSignupCardDelete(NfcSignUpUnsubscribeForm form,
            final IDKGatewayResponse.Listener<Void> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.nfcSignupCardDelete(form, responseListener, errorListener);
    }

    // ########################################
    // Html plugins methods
    // ########################################

    /**
     * Make an api call that return a DocumentModel using the url, parameters and httpMethod passed
     * from Html through a Cordova plugin.
     */
    public void downloadPdf(String url, String params, String httpMethod,
            final IDKGatewayResponse.Listener<DocumentModel> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.downloadPdf(url, params, httpMethod, responseListener, errorListener);
    }

    /**
     * Make an api call that return a NativeResponse model using the url, method and other
     * parameters passed from Html through a Cordova plugin.
     */
    public void htmlToNativeRequest(String url, String method, String body, Map<String, String> headers,
            final IDKGatewayResponse.Listener<NativeResponse> responseListener,
            final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.htmlToNativeRequest(url, method, body, headers, responseListener, errorListener);
    }

    /*
     * Service Health requests
     */
    public void serviceHealth(final IDKGatewayResponse.Listener<Void> responseListener,
                              final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.serviceHealth(responseListener, errorListener);

    }

    public void serviceHealthFake(int operation, final IDKGatewayResponse.Listener<Void> responseListener,
                              final IDKGatewayResponse.ErrorListener errorListener) {
        mGateway.serviceHealthFake(operation,responseListener,errorListener);

    }

    public static String getNameEnv() {
        return nameEnv;
    }

    public void setNameEnv(String nameEnv) {
        this.nameEnv = nameEnv;
    }
}

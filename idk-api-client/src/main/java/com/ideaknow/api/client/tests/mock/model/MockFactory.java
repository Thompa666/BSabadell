package com.ideaknow.api.client.tests.mock.model;

import com.ideaknow.api.client.SabadellApi;
import com.ideaknow.api.client.enums.PaginatorOrder;
import com.ideaknow.api.client.forms.nfc.NfcSignUpCardModel;
import com.ideaknow.api.client.model.AccountModel;
import com.ideaknow.api.client.model.AmountModel;
import com.ideaknow.api.client.model.AtmMobileEnrollmentListModel;
import com.ideaknow.api.client.model.AtmMobileEnrollmentModel;
import com.ideaknow.api.client.model.BooleanResponseModel;
import com.ideaknow.api.client.model.CardModel;
import com.ideaknow.api.client.model.CommissionModel;
import com.ideaknow.api.client.model.CompanyModel;
import com.ideaknow.api.client.model.ErrorResponse;
import com.ideaknow.api.client.model.KeyValueModel;
import com.ideaknow.api.client.model.OperationModel;
import com.ideaknow.api.client.model.PaginatorModel;
import com.ideaknow.api.client.model.ParamsModel;
import com.ideaknow.api.client.model.PolicyModel;
import com.ideaknow.api.client.model.StringResponseModel;
import com.ideaknow.api.client.model.TelephoneModel;
import com.ideaknow.api.client.model.accounts.AccountMovementModel;
import com.ideaknow.api.client.model.accounts.AccountMovementsListModel;
import com.ideaknow.api.client.model.accounts.AccountPayerModel;
import com.ideaknow.api.client.model.accounts.AccountPayersModel;
import com.ideaknow.api.client.model.accounts.AccountsListModel;
import com.ideaknow.api.client.model.agent.AgentModel;
import com.ideaknow.api.client.model.agent.AgentSessionModel;
import com.ideaknow.api.client.model.alerts.AlertContractListModel;
import com.ideaknow.api.client.model.alerts.AlertContractModel;
import com.ideaknow.api.client.model.atmmobile.AtmMobileCommissionListModel;
import com.ideaknow.api.client.model.atmmobile.AtmMobileOtpModel;
import com.ideaknow.api.client.model.banner.BannerModel;
import com.ideaknow.api.client.model.banner.BannerOperationModel;
import com.ideaknow.api.client.model.blacklist.BlackListModel;
import com.ideaknow.api.client.model.blacklist.BlackListOperationModel;
import com.ideaknow.api.client.model.cards.CardActivationModel;
import com.ideaknow.api.client.model.cards.CardConditionsModel;
import com.ideaknow.api.client.model.cards.CardLastMovementModel;
import com.ideaknow.api.client.model.cards.CardListModel;
import com.ideaknow.api.client.model.cards.CardMovementGeoPointModel;
import com.ideaknow.api.client.model.cards.CardMovementModel;
import com.ideaknow.api.client.model.cards.CardMovementsCreditSplitPeriodsModel;
import com.ideaknow.api.client.model.cards.CardMovementsDebitSplitPeriodsModel;
import com.ideaknow.api.client.model.cards.CardMovementsListModel;
import com.ideaknow.api.client.model.cards.CardPaymentModeModel;
import com.ideaknow.api.client.model.cards.CardPrepaidReloadAmountsModel;
import com.ideaknow.api.client.model.cards.CardPrepaidReloadCommissionsModel;
import com.ideaknow.api.client.model.cards.CardPrepaidReloadModel;
import com.ideaknow.api.client.model.cards.CardProfileCountriesListModel;
import com.ideaknow.api.client.model.cards.CardProfileRuleModel;
import com.ideaknow.api.client.model.cards.CardProfileRulesListModel;
import com.ideaknow.api.client.model.cards.CardSettlementModel;
import com.ideaknow.api.client.model.cards.CardSettlementsModel;
import com.ideaknow.api.client.model.cards.NfcModel;
import com.ideaknow.api.client.model.cards.PeriodModel;
import com.ideaknow.api.client.model.checks.CheckModel;
import com.ideaknow.api.client.model.companies.CompaniesListModel;
import com.ideaknow.api.client.model.companies.CompanyCreditLimitsModel;
import com.ideaknow.api.client.model.directdebit.DirectDebitListModel;
import com.ideaknow.api.client.model.directdebit.DirectDebitModel;
import com.ideaknow.api.client.model.document.DocumentModel;
import com.ideaknow.api.client.model.expansionlines.ExpansionLineModel;
import com.ideaknow.api.client.model.glass.SessionAccountMovementsModel;
import com.ideaknow.api.client.model.glass.SessionAccountsModel;
import com.ideaknow.api.client.model.glass.SessionAgentAccountsModel;
import com.ideaknow.api.client.model.inbox.InboxModel;
import com.ideaknow.api.client.model.inbox.InboxesModel;
import com.ideaknow.api.client.model.instantmoney.InstantMoneyCommissionsModel;
import com.ideaknow.api.client.model.instantmoney.InstantMoneyModel;
import com.ideaknow.api.client.model.key.KeyModel;
import com.ideaknow.api.client.model.key.OtpQueryKeyModel;
import com.ideaknow.api.client.model.mail.MailListModel;
import com.ideaknow.api.client.model.mail.MailModel;
import com.ideaknow.api.client.model.menu.AndroidModel;
import com.ideaknow.api.client.model.menu.MenuModel;
import com.ideaknow.api.client.model.menu.MenuOperationModel;
import com.ideaknow.api.client.model.nfc.NfcSessionModel;
import com.ideaknow.api.client.model.offices.GeoPointModel;
import com.ideaknow.api.client.model.offices.OfficeListModel;
import com.ideaknow.api.client.model.offices.OfficeModel;
import com.ideaknow.api.client.model.product.AccountCreditModel;
import com.ideaknow.api.client.model.product.AccountFinancialModel;
import com.ideaknow.api.client.model.product.AccountLoanModel;
import com.ideaknow.api.client.model.product.AccountProductModel;
import com.ideaknow.api.client.model.product.CardProductModel;
import com.ideaknow.api.client.model.product.DepositProductModel;
import com.ideaknow.api.client.model.product.ExpansionLineGPModel;
import com.ideaknow.api.client.model.product.FinancialProductModel;
import com.ideaknow.api.client.model.product.IPFFinancialModel;
import com.ideaknow.api.client.model.product.InvestmentProductModel;
import com.ideaknow.api.client.model.product.ProductsCardsModel;
import com.ideaknow.api.client.model.product.ProductsListModel;
import com.ideaknow.api.client.model.product.UnknownListModel;
import com.ideaknow.api.client.model.product.UnknownModel;
import com.ideaknow.api.client.model.promolayers.PromoLayerResultModel;
import com.ideaknow.api.client.model.push.PushDeviceListModel;
import com.ideaknow.api.client.model.push.PushDeviceModel;
import com.ideaknow.api.client.model.push.PushDeviceResponseModel;
import com.ideaknow.api.client.model.push.PushMessageListModel;
import com.ideaknow.api.client.model.push.PushMessageModel;
import com.ideaknow.api.client.model.risk.RiskProductModel;
import com.ideaknow.api.client.model.risk.RiskRecordListModel;
import com.ideaknow.api.client.model.risk.RiskRecordModel;
import com.ideaknow.api.client.model.session.ContractListModel;
import com.ideaknow.api.client.model.session.ContractModel;
import com.ideaknow.api.client.model.session.PromoLayerModel;
import com.ideaknow.api.client.model.session.SessionModel;
import com.ideaknow.api.client.model.session.UserModel;
import com.ideaknow.api.client.model.status.StatusModel;
import com.ideaknow.api.client.model.status.VersionModel;
import com.ideaknow.api.client.model.tpc.CardCodeModel;
import com.ideaknow.api.client.model.tpc.ContractResponseModel;
import com.ideaknow.api.client.model.tpc.TpcKey;
import com.ideaknow.api.client.model.tpc.TpcKeyListModel;
import com.ideaknow.api.client.model.tpv.MerchantListModel;
import com.ideaknow.api.client.model.tpv.MerchantModel;
import com.ideaknow.api.client.model.tpv.TerminalListModel;
import com.ideaknow.api.client.model.tpv.TerminalModel;
import com.ideaknow.api.client.model.tpv.TpvOperationListModel;
import com.ideaknow.api.client.model.tpv.TpvOperationModel;
import com.ideaknow.api.client.model.transfer.AccountTransferToCardModel;
import com.ideaknow.api.client.model.transfer.BanksModel;
import com.ideaknow.api.client.model.transfer.BeneficiariesModel;
import com.ideaknow.api.client.model.transfer.BeneficiaryModel;
import com.ideaknow.api.client.model.transfer.BeneficiaryResultModel;
import com.ideaknow.api.client.model.transfer.BicsModel;
import com.ideaknow.api.client.model.transfer.CardToAccountCommissionModel;
import com.ideaknow.api.client.model.transfer.CardToAccountTransferModel;
import com.ideaknow.api.client.model.transfer.CitiesModel;
import com.ideaknow.api.client.model.transfer.CommissionsModel;
import com.ideaknow.api.client.model.transfer.CountriesListModel;
import com.ideaknow.api.client.model.transfer.CountryModel;
import com.ideaknow.api.client.model.transfer.CurrenciesModel;
import com.ideaknow.api.client.model.transfer.DollarDatesModel;
import com.ideaknow.api.client.model.transfer.OwnTransferModel;
import com.ideaknow.api.client.model.transfer.OwnTransferResponseModel;
import com.ideaknow.api.client.model.transfer.PeriodicalTransferModel;
import com.ideaknow.api.client.model.transfer.PeriodicalTransferResponseModel;
import com.ideaknow.api.client.model.transfer.TransferCancelModel;
import com.ideaknow.api.client.model.transfer.TransferModel;
import com.ideaknow.api.client.model.transfer.TransferPeriodicalInfoModel;
import com.ideaknow.api.client.model.transfer.TransferResponseModel;
import com.ideaknow.api.client.model.transfer.TransfersListModel;
import com.ideaknow.api.client.network.NativeResponse;
import com.ideaknow.formatter.IDKAmountFormatter;
import com.ideaknow.formatter.IDKCardNumberFormatter;

import java.util.*;

public class MockFactory {

    public static final String TEST_SECOND_KEY_NUMBER = "34";
    public static final int TEST_SECOND_KEY_VALUE = 7880;
    public static final int TEST_SECOND_KEY_CODES_SIZE = 80;
    public static final String TEST_CARD_ACTIVATION_PIN = "1234";
    public static final String TEST_STRING = "TEST";
    public static final String TEST_STRING_OTHER = "TEST OTHER";
    public static final String TEST_ERROR = "ERROR";
    public static final String TEST_NUMBER = "420";
    public static final int TEST_INT = 420;
    public static final String TEST_INT_RESULT = "420" + IDKCardNumberFormatter.WHITE_SPACE;
    public static final String TEST_DATE = "20-04-2020";
    public static final String TEST_DATE_RENDERED = "04/20";
    public static final int TEST_NUMBER_OF_ITEMS = 6;
    public static final int BOTTOM_PRODUCTS_MODEL_MOBILE = 3;
    public static final int BOTTOM_PRODUCTS_MODEL_TABLET = 2;
    public static final int TOTAL_FINANCIAL_PRODUCTS = 4;

    // Accounts
    public static final String TEST_COUNTRY = "011";
    public static final String CUSTOMER_NAME = "&SNOMBRE G00822311";
    public static final String CUSTOMER_SURNAME1 = "&KPRIAPE P00822311";
    public static final String CUSTOMER_SURNAME2 = "&ASEGAPE M00822311";
    public static final String CUSTOMER_FULLNAME = "&SNOMBRE G00822311 &KPRIAPE P00822311 " +
            "&ASEGAPE M00822311";
    public static final String CUSTOMER_NIF = "36888662C";
    public static final String PERSON_NUMBER = "personNumber";
    public static final String SENDER_TYPE = "01";
    public static final String TOWN = "SANT CUGAT DEL VALLES";

    // AgentModel
    public static final String AGENT_EMAIL = "SoleMo@bancsabadell.com";
    public static final String AGENT_PHONE = "937288839";
    public static final String AGENT_NAME = "Pepe Moreno";
    public static final String AGENT_OFFICE = "0052";

    // BeneficiaryModel
    public static final String BENEFICIARY_EMAIL = "SoleMo@bancsabadell.com";
    public static final String BENEFICIARY_PHONE = "637288839";
    public static final String BENEFICIARY_NAME = "Pepe Moreno";

    // CardModel
    public static final String DATE_TEST = "10-04-2014";
    public static final String COMMISSION_VALUE = "1,00";
    public static final String ORIGIN_AMOUNT_VALUE = "3001,00";
    public static final String DEBIT_CARD_ALIAS = "DEBIT CARD";
    public static final String CREDIT_CARD_ALIAS = "CREDIT CARD";
    public static final String PREPAID_CARD_ALIAS = "PREPAID CARD";

    // CardToAccountCommissionModel
    public static final String TEST_ID = "testid";
    public static final String ACCOUNT_NUMBER = "0081-0000-00-1230000";
    public static final String ACCOUNT_NUMBER_OTHER = "0182-2370-46-0010022227";

    // CompanyModel.
    private static final String TEST_COMPANY_NAME = "&EPRIAPE J01470610";
    private static final String TEST_COMPANY_NIF = "46126269E";

    // Offices
    public static final double OFFICE_DIST_TO_POINT = 0.33;
    public static final String OFFICE_NUM = "5557";
    public static final String OFFICE_NAME = "Barcelona, Pl. Maragall";
    public static final String OFFICE_ADDRESS = "PL. MARAGALL, 1";
    public static final String OFFICE_LOCATION = "BARCELONA";
    public static final String OFFICE_POSTAL_CODE = "08041";
    public static final String OFFICE_DIRECTOR = "-";
    public static final String OFFICE_PHONE = "933514443";
    public static final int OFFICE_TYPE = 1;
    public static final double OFFICE_LAT = 41.419693;
    public static final double OFFICE_LNG = 2.180768;

    // Split
    public static final String CODE = "01";
    public static final String INTEREST = "1,00";
    public static final String MONTHS = "6";
    public static final String TAE = "26,08%";
    public static final int PERIODS_COUNT = 3;

    // Document
    public static final String DOCUMENT_NAME = "Document name";

    // CardPaymentModeModel
    public static final int TEST_ID_INT = 4984;

    // Card conditions
    public static final String TEST_AMOUNT_VALUE = "3000,00";
    public static final String TEST_AMOUNT_CURRENCY = "EUR";
    public static final String TEST_AMOUNT_VALUE_WITH_CURRENCY = "3000,00€";
    public static final String TEST_CONTRACT = "000004016575133";
    public static final String TEST_ACCOUNT_BANK_ACCOUNT_NUMBER = "0052-0001238327";
    public static final String TEST_PAYMENT_MODE_ID = "02";
    public static final String TEST_PAYMENT_MODE_MAX_AMOUNT_VALUE = "200,00";
    public static final String TEST_PAYMENT_MODE_BALANCE_VALUE = "3";
    public static final String TEST_PAYMENT_MODE_MAX_AMOUNT_VALUE_INVALID = "29";
    public static final String TEST_PAYMENT_MODE_PENDING_BALANCE_VALUE_INVALID = "1";
    public static final String TEST_INTEREST_PERCENTATGE = "1.00";

    // Instant check.
    public static final String TEST_CHECK_NUMBER = "2542769";
    public static final String TEST_CHECK_NUMBER_CONTROL_DIGIT = "0";
    public static final String TEST_CHECK_TYPE = "8200-3";
    public static final String TEST_CHECK_TYPE_CONTROL_DIGIT = "3";

    // Movement
    public static final String TEST_MOVEMENT_CONCEPT = "TRASPASO A 0052-00022330-30";

    // ATM
    private static final String TEST_ATM_OTP = "497596";
    public static final String TEST_ATM_QR_DATA =
            "MP#ATMMOBI#08#58EDAD7E0D144980EBDBE3C3E3A7B020A94FA8ECF9A6576CDAB9B10E4C8E9742#123456789200";
    public static final String TEST_ATM_OTP_HASH =
            "58EDAD7E0D144980EBDBE3C3E3A7B020A94FA8ECF9A6576CDAB9B10E4C8E9742";

    // Instant Money
    public static final String TEST_PURPOSE = "instant money";
    public static final String TEST_CODE = "********";
    public static final String TEST_TIME = "15:05:11";
    public static final String TEST_OPERATIVE_CODE = "4";

    // Card profiles
    // TODO: check if I can suppose this to be always like api
    private static final String FOREIGN_RULE = "001";
    private static final String INTERNET_RULE = "002";
    private static final boolean RULE_STATUS_ACTIVE = true;
    private static final boolean RULE_STATUS_INACTIVE = false;

    // Card prepaid reload
    public static final String TEST_CONTRACT_CCC = "00817011100001300636";

    // Push
    private static final String ID_MSG = "1080";
    private static final String ID_MSG_EXT = "ONLAA.000000000012011020";
    private static final String REF_APP = "bsmobil";
    private static final String TS_CREATE = "1381311285908";
    public static final String PUSH_TYPE = "P";
    public static final String CONTRACT_NUMBER = "5270036605";
    public static final String ENVIROMENT = "MULTIP";
    public static final String INITIAL_DATE = "27-12-2006";
    public static final String LAST_PRINT_DATE = "04-01-2011";
    public static final String PERSON_NUMBER_INT = "000587245";
    public static final String PUSH = "000000000090004711";

    // Card pin recovery
    public static final String TEST_STRING_RESPONSE_PIN_REC = "0250";

    // Card activation
    public static final String GENERAL_CONDITIONS = "Texto de condiciones generales";
    public static final String SPECIFIC_CONDITIONS = "Texto de condiciones especificas";

    // National Transfer (TRAF) testing values
    public static final String TEST_EMPTY_BENEFICIARY = "";
    public static final String TEST_IBAN = "ES9201822370460010022227";
    public static final String TEST_OPERATION_NUMBER = "9999M15F0005";
    private static final String TEST_PERIODICITY = "10";
    private static final String TEST_PERIODICITY_CODE = "D";

    // Commissions
    public static final String[] TEST_COMMISSIONS_IDS
            = { "total", "process", "urgency", "repair", "swift", "correspondent", "post" };
    public static final int TEST_COMMISSIONS_LENGHT = TEST_COMMISSIONS_IDS.length;
    public static final String TEST_COMMISSIONS_MAX_CUT_DATE = "27-06-2014";
    public static final String TEST_COMMISSIONS_MAX_CUT_TIME = "17:00";
    public static final String TEST_COMMISSIONS_NEXT_CUT_DATE = "27-06-2014";
    public static final String[] TEST_COMMISSIONS_KEYS = { "Importe origen", "Comisión" };
    public static final String[] TEST_COMMISSIONS_VALUES = { "200€", "2€" };

    // Mails
    private static final String MAIL_CONTRACT = "100520000012383";
    private static final String MAIL_ENTITY = "01";
    private static final String MAIL_DOCUMENT_ID = "20120201000000219339";
    private static final String MAIL_PRODUCT = "DV";
    private static final String MAIL_CATEGORY = "Recibos";
    private static final String MAIL_SUBJECT = "ADEUDO RECIBO ESCOLA PIA DE SABADELL";
    private static final String MAIL_CONTENT = "";
    private static final String MAIL_DATE = "01-02-2012";
    private static final String MAIL_PDF_ID = "TEST";
    private static boolean MAIL_READ = false;

    // TPC
    public static final String TPC_CODE = "949330";
    public static final String TPC_CODE_SPACED = "9 4 9 3 3 0";
    public static final String TPC_KEY_NUMBER = "0";

    // vTPC
    public static final String VTPC_REFER_OTP_RISK_FLAG = "vTP";
    public static final String VTPC_REFER_OTP = VTPC_REFER_OTP_RISK_FLAG + "519134";
    public static final String VTPC_REFER_OTP_RISK = "519134";
    public static final String
            VTPC_INSCRIPTION_KEY = "EASM86ISAA1C2UFL1I3E0H6KI1D1NJCLU623CC8C414A75FFED";
    public static final String VTPC_PHONE_PREFIX = "34";
    public static final String VTPC_PHONE = "669444931";

    public static final String VTPC_PUSH_WITH_RISK = "Servei de Signatura Digital."
            + " Cliqui aquí per introduir la contrasenya:";
    public static final String VTPC_PUSH_WITHOUT_RISK = "Servei de Signatura Digital." +
            " Cliqui aquí per introduir la contrasenya: vTPGAHTHA2ZVU";

    // Status
    public static final boolean STATUS_LOGGED = true;
    public static final String STATUS_OS = "Android";
    public static final String STATUS_OS_VERSION = "*";
    public static final String STATUS_MINIMAL = "1.61";
    public static final String STATUS_RECOMMENDED = "2.3";
    public static final String STATUS_URL = "https://play.google.com/store/apps/details?id=net"
            + ".inverline.bancosabadell.officelocator.android";

    // ATM Mobile enrollment.
    public static final String ATM_MOBILE_ENROLLMENT_ENTITY_CODE = "01";
    public static final String ATM_MOBILE_ENROLLMENT_ID = "000000000010";
    public static final String ATM_MOBILE_ENROLLMENT_SERVICE_NAME =
            "Virtual Tarjeta Personal de Coordenadas";
    public static final String ATM_MOBILE_ENROLLMENT_STATUS = "V";
    public static final String ATM_MOBILE_ENROLLMENT_TYPE_KEY = "BS";
    public static final String ATM_MOBILE_ENROLLMENT_TYPE_VALUE =
            "Bs. Particulares         (08 Esp)";

    // User.
    public static final String USER_CONTRACT_NUMBER = "2170595759";
    public static final String USER_CUSTOMIZATION = "";
    public static final String USER_DNI = "36888662C";
    public static final boolean USER_HAS_MORE_CONTRACTS = false;
    public static final String USER_ID_TYPE = "01";
    public static final boolean USER_IS_NEW_USER = false;
    public static final int LOGIN_TYPE_INDIVIDUAL = 1;
    public static final int LOGIN_TYPE_COMPANY = 2;
    public static final String USER_NAME = "SNOMBRE G00822311 KPRIAPE P0";
    public static final int USER_PENDING_SIGN_OPERATIONS = 0;
    public static final String USER_PERSON_NUMBER1 = "822311";
    public static final String USER_PHONE_NUMBER = "+34666555666";
    public static final String USER_SEX = "M";
    public static final String USER_EMAIL = "user@bancsabadell.com";

    // Transfer international
    public static final String TEST_BANK_NAME = "AFGHANISTAN INTERNATIONAL BANK";
    public static final String TEST_BANK_CODE = "AFIB";
    public static final String TEST_BANK_CITY_CODE = "KABUL";
    public static final String TEST_BANK_COUNTRY_CODE = "AF";
    public static final String TEST_BANK_BIC = "AFIBAFKAXXX";
    public static final String TEST_BANK_ADDRESS = "E AND F";
    public static final String TEST_BANK_COUNTRY_NAME = "Afganistan";
    public static final String TEST_COUNTRY_NAME = "Afganistan";
    public static final String TEST_COUNTRY_CODE = "AF";

    // Transfer international (European Economic Area) EEA = EU + EFTA - Suiza
    public static final String TEST_EEE_BANK_NAME = "AUSTRIA INTERNATIONAL BANK";
    public static final String TEST_EEE_BANK_CODE = "ATIB";
    public static final String TEST_EEE_BANK_CITY_CODE = "VIENNA";
    public static final String TEST_EEE_BANK_COUNTRY_CODE = "AT";
    public static final String TEST_EEE_BANK_BIC = "VOVBAT2BXXX";
    public static final String TEST_EEE_BANK_ADDRESS = "E AND T";
    public static final String TEST_EEE_BANK_COUNTRY_NAME = "Austria";
    public static final String TEST_EEE_COUNTRY_NAME = "Austria";
    public static final String TEST_EEE_COUNTRY_CODE = "AT";
    public static final String TEST_EEE_IBAN = "AT344571000171000315";

    // DIRECT DEBIT
    public static final String DIRECT_DEBIT_STATUS = "I";
    public static final String DIRECT_DEBIT_CONTRACT = "000000571263460";
    public static final String DIRECT_DEBIT_DEBTOR = "TARREGA SIMON, ORIOL";
    public static final String DIRECT_DEBIT_ISSUER = "1-UNIO ESPORTIVA RUBI Hockey patins (prova de descripcio llarga per a terminals mobils)";
    public static final String DIRECT_DEBIT_NUMOP = "4";
    public static final boolean DIRECT_DEBIT_PAY = false;
    public static final String DIRECT_DEBIT_REFERENCE = "2170595759";

    // COMPANIES CREDIT LIMIT
    public static final String CREDIT_LIMIT_IDENTIFIER = "INGS";
    public static final String CREDIT_LIMIT_CODE = "000000066";
    public static final String CREDIT_LIMIT_TITLE = "INGRESO DE CHEQUES ON-LINE";
    public static final String CREDIT_LIMIT_CARD_USER_REFERENCE = "&LNOMBRE A04038279 &MPRIAPE F0";
    public static final String CREDIT_LIMIT_CARD_USER_ID = "70315894H";
    public static final String CREDIT_LIMIT_CARD_SITUATION_HANDLE = "P";
    public static final String CREDIT_LIMIT_CARD_SITUATION_VALUE = "TIPUBS148242044";
    public static final String CREDIT_LIMIT_CONDITIONS_DOCUMENT_URL = "https://www.logalty" +
            ".es/lgt/tablon/public/docs/98185a2d9a3ade8a669040f4b2c4a7d16cb1ffed/";
    public static final String CREDIT_LIMIT_CONDITIONS_DOCUMENT_NAME = "credit_conditions.pdf";

    // MENU XML
    public static final String MENU_ACTION_APP_LAUNCH_ACTIVITY = "mainActivity";
    public static final String MENU_ACTION_APP_LAUNCH_PACKAGE = "com.bancsabadell.solvia";
    public static final String MENU_ACTION_OPERATION_BLOCK = "cards";
    public static final String MENU_ACTION_URL = "http://m.solvia.es";
    public static final String MENU_ACTION_OPERATION_NAME = "finances";
    public static final String MENU_ACTION = "openOp";

    // Merchant and terminals.
    private static final String MERCHANT_ID = "327396099";
    private static final String MERCHANT_NAME = "M&G FINQUES I ADMINISTRACIO RUBI,SL";
    public static final String TERMINAL_ID = "02";
    public static final String TERMINAL_TYPE = "MP";

    // Promo layer.
    private static final String PROMO_LAYER_CODE = "DATCOACT_00000007_KX_30081301";
    private static final String PROMO_LAYER_URL = "resources/mobapp/layers/DATCOACT/";
    public static final int PROMO_LAYER_SHOWS = 5;
    public static final boolean PROMO_LAYER_EXIST = false;

    // Tpv.
    public static final String TPV_OPERATION_ORDER = "140722110815";
    public static final boolean TPV_OPERATION_REFUND = false;
    public static final String TPV_OPERATION_RESULT = "0000";
    public static final boolean TPV_OPERATION_SECURE_PAYMENT = false;
    private static final String TPV_OPERATION_STATUS_KEY = "F";
    private static final String TPV_OPERATIONS_STATUS_VALUE = "Finalizada";

    // BlackList
    public static final String[] BLACK_LIST_OPTIONS = { "accounts", "alerts", "alertsChannel",
                                                        "advancePaymentBills" };
    public static final String BLACK_LIST_OPTION_OPEN = "open";
    public static final String BLACK_LIST_OPTION_CLOSE = "close";

    // Contracts (Company)
    private static final String TEST_CONTRACT_NAME = "000006270255252";
    private static final String TEST_CONTRACT_NUMBER = "&JPJURID O18077362";

    // Wallet NFC
    private static final String TEST_WALLET_NFC_OTP = "d89f76d0a908ea17ddca2730c301b93a8eb13a7bd235cfcea0f6d098797481d5";
    public static final String TEST_WALLET_NFC_DEVICE_ID = "242ae43e4316217cc41229d91b34586c39573333a158c878f9";
    public static final String TEST_WALLET_NFC_USER_ID = "dd189fb149bffb7bc65095ea9d3de4bf271fcf0e160a30ff7ed62ade23e8d56b";

    // Banner Wallet
    private static final String OPEN_APP = "openApp";
    private static final String BANNER_WALLET_ICON_URL = "resources/mobapp/banner/wallet/x1.5/banner_wallet_es.png";

    // Plugin Html to native Request
    private static final String HTML_TO_NATIVE_REQUEST_URL = "http://bstest.ideaknow.com/bsmobil/api/contactdata?";
    private static final int STATUS_OK = 200;
    private static final String ACCEPT = "Accept";
    private static final String ACCEPT_VALUE = SabadellApi.ACCEPT_VALUE;
    private static final String ACCEPT_LANGUAGE = "Accept-Language";
    private static final String ES_ES = "es-ES";

    // Inbox
    public static final String INBOX_NOTIFICATION_ID = "notifications";
    public static final String INBOX_CONTRACTS_ID = "contracts";
    public static final String INBOX_MAILBOX_ID = "mailing";
    public static final String INBOX_SIGNATURES_ID = "signOperations";
    public static final int INBOXES_BADGE = 3;
    public static final int INBOX_NOTIFICATION_BADGE = 200;
    public static final int INBOX_CONTRACTS_BADGE = 62;
    public static final int INBOX_MAILBOX_BADGE = 5;
    public static final int INBOX_SIGNATURES_BADGE = 6;

    public static ArrayList<AccountModel> accounts() {
        ArrayList<AccountModel> accounts = new ArrayList<AccountModel>();
        for (int i = 0; i < TEST_NUMBER_OF_ITEMS; i++) {
            if (i != TEST_NUMBER_OF_ITEMS - 1) {
                accounts.add(accountModel());
            } else {
                accounts.add(accountModelOther());
            }
        }

        return accounts;
    }

    public static ArrayList<AccountModel> accountsMixCurrencies() {
        ArrayList<AccountModel> accounts = new ArrayList<AccountModel>();

        AccountModel accountEuroModel = accountModel();
        accounts.add(accountEuroModel);

        AccountModel accountDollarModel = accountModel();
        accountDollarModel.getAmount().setValue(ORIGIN_AMOUNT_VALUE);
        accountDollarModel.getAmount().setCurrency(IDKAmountFormatter.DOLLAR_CODE);
        accounts.add(accountDollarModel);

        AccountModel accountPoundModel = accountModel();
        accountPoundModel.getAmount().setCurrency(IDKAmountFormatter.POUND_CODE);
        accounts.add(accountPoundModel);

        return accounts;
    }

    public static AccountModel accountModel() {
        AccountModel account = new AccountModel();
        account.setDescription(TEST_STRING);
        account.setAlias(TEST_STRING);
        account.setAvailability(TEST_STRING);
        account.setBic(TEST_STRING);
        account.setIban(TEST_IBAN);
        account.setNumber(ACCOUNT_NUMBER);
        account.setOwner(CUSTOMER_NAME);
        account.setProduct(TEST_SECOND_KEY_NUMBER);
        account.setJoint(TEST_STRING);
        account.setAmount(amountModel());

        return account;
    }

    public static AccountModel eeeAccountModel() {
        AccountModel account = new AccountModel();
        account.setDescription(TEST_STRING);
        account.setAlias(TEST_STRING);
        account.setAvailability(TEST_STRING);
        account.setBic(TEST_STRING);
        account.setIban(TEST_EEE_IBAN);
        account.setNumber(ACCOUNT_NUMBER);
        account.setOwner(CUSTOMER_NAME);
        account.setProduct(TEST_SECOND_KEY_NUMBER);
        account.setJoint(TEST_STRING);
        account.setAmount(amountModel());

        return account;
    }

    public static AccountModel accountModelOther() {
        AccountModel account = accountModel();
        account.setNumber(ACCOUNT_NUMBER_OTHER);
        account.setAlias(TEST_STRING_OTHER);

        return account;
    }

    public static AccountPayerModel accountPayer() {
        AccountPayerModel accountPayerModel = new AccountPayerModel();

        accountPayerModel.setAddress(OFFICE_ADDRESS);
        accountPayerModel.setCountry(TEST_COUNTRY);
        accountPayerModel.setCustomerName(CUSTOMER_NAME);
        accountPayerModel.setCustomerSurname1(CUSTOMER_SURNAME1);
        accountPayerModel.setCustomerSurname2(CUSTOMER_SURNAME2);
        accountPayerModel.setNif(CUSTOMER_NIF);
        accountPayerModel.setName(CUSTOMER_FULLNAME);
        accountPayerModel.setPersonNumber(PERSON_NUMBER);
        accountPayerModel.setPersonType(TEST_STRING);
        accountPayerModel.setPostCode(TEST_STRING);
        accountPayerModel.setSenderType(SENDER_TYPE);
        accountPayerModel.setTown(TOWN);

        return accountPayerModel;
    }

    public static AccountPayersModel accountPayers() {
        AccountPayersModel accountPayersModel = new AccountPayersModel();

        ArrayList<AccountPayerModel> accountsPayers = new ArrayList<AccountPayerModel>();
        for (int i = 0; i < TEST_NUMBER_OF_ITEMS; i++) {
            accountsPayers.add(accountPayer());
        }
        accountPayersModel.setAccountPayers(accountsPayers);

        return accountPayersModel;
    }

    public static AgentModel agentModel() {
        AgentModel model = new AgentModel();

        model.setEmail(AGENT_EMAIL);
        model.setPhone(AGENT_PHONE);
        model.setName(AGENT_NAME);
        model.setOffice(AGENT_OFFICE);

        return model;
    }

    public static BooleanResponseModel agentAvailableModel() {
        BooleanResponseModel model = new BooleanResponseModel();

        model.setResult(true);

        return model;
    }

    public static AmountModel amountModel() {
        return amountModel(TEST_AMOUNT_VALUE);
    }

    public static AmountModel amountModel(String value) {
        AmountModel amount = new AmountModel();
        amount.setCurrency(IDKAmountFormatter.EURO_CODE);
        amount.setValue(value);
        return amount;
    }

    public static AtmMobileCommissionListModel atmMobileCommissionListModel() {
        AtmMobileCommissionListModel model = new AtmMobileCommissionListModel();

        ArrayList<CommissionModel> commissions = new ArrayList<CommissionModel>();
        for (int i = 0; i < TEST_NUMBER_OF_ITEMS; i++) {
            commissions.add(commissionModel(i));
        }
        model.setCommissions(commissions);

        return model;
    }

    public static AtmMobileEnrollmentListModel atmMobileEnrollmentListModel() {
        AtmMobileEnrollmentListModel model = new AtmMobileEnrollmentListModel();

        ArrayList<AtmMobileEnrollmentModel> enrollments = new ArrayList<AtmMobileEnrollmentModel>();
        for (int i = 0; i < TEST_NUMBER_OF_ITEMS; i++) {
            enrollments.add(atmMobileEnrollmentModel());
        }
        model.setEnrollments(enrollments);

        return model;
    }

    public static AtmMobileEnrollmentModel atmMobileEnrollmentModel() {
        AtmMobileEnrollmentModel model = new AtmMobileEnrollmentModel();

        model.setAlias("");
        model.setDeleteDate("");
        model.setEntityCode(ATM_MOBILE_ENROLLMENT_ENTITY_CODE);
        model.setId(ATM_MOBILE_ENROLLMENT_ID);
        model.setInscriptionKey("");
        model.setRegisterDate(TEST_DATE);
        model.setServiceName(ATM_MOBILE_ENROLLMENT_SERVICE_NAME);
        model.setStatus(ATM_MOBILE_ENROLLMENT_STATUS);
        KeyValueModel type = new KeyValueModel();
        type.setKey(ATM_MOBILE_ENROLLMENT_TYPE_KEY);
        type.setValue(ATM_MOBILE_ENROLLMENT_TYPE_VALUE);
        model.setType(type);

        return model;
    }

    public static AtmMobileOtpModel atmMobileOtpModel() {
        AtmMobileOtpModel model = new AtmMobileOtpModel();

        model.setOtp(TEST_ATM_OTP);

        return model;
    }

    public static BeneficiariesModel beneficiariesModel() {
        BeneficiariesModel beneficiariesModel = new BeneficiariesModel();

        ArrayList<BeneficiaryModel> benefs = new ArrayList<BeneficiaryModel>();

        for (int i = 0; i < TEST_NUMBER_OF_ITEMS; ++i) {
            if (i % 2 == 0) {
                benefs.add(beneficiaryModel());
            }
            else {
                benefs.add(eeeBeneficiaryModel());
            }
        }

        beneficiariesModel.setBeneficiaries(benefs);

        return beneficiariesModel;
    }

    public static BeneficiaryModel beneficiaryModel() {
        BeneficiaryModel beneficiaryModel = new BeneficiaryModel();
        beneficiaryModel.setAccount(beneficiaryAccountModel());
        beneficiaryModel.setAddress(OFFICE_ADDRESS);
        beneficiaryModel.setBeneficiaryId(TEST_ID);
        beneficiaryModel.setCity(TOWN);
        beneficiaryModel.setMail(BENEFICIARY_EMAIL);
        beneficiaryModel.setName(CUSTOMER_FULLNAME);
        beneficiaryModel.setPhoneNumber(BENEFICIARY_PHONE);
        beneficiaryModel.setBankName(TEST_BANK_NAME);
        beneficiaryModel.setAccountCountry(countryModel());
        beneficiaryModel.setCountry(countryModel());

        return beneficiaryModel;
    }

    public static BeneficiaryModel eeeBeneficiaryModel() {
        BeneficiaryModel beneficiaryModel = new BeneficiaryModel();
        beneficiaryModel.setAccount(eeeBeneficiaryAccountModel());
        beneficiaryModel.setAddress(OFFICE_ADDRESS);
        beneficiaryModel.setBeneficiaryId(TEST_ID);
        beneficiaryModel.setCity(TOWN);
        beneficiaryModel.setMail(BENEFICIARY_EMAIL);
        beneficiaryModel.setName(CUSTOMER_FULLNAME);
        beneficiaryModel.setPhoneNumber(BENEFICIARY_PHONE);
        beneficiaryModel.setBankName(TEST_EEE_BANK_NAME);
        beneficiaryModel.setAccountCountry(eeeCountryModel());
        beneficiaryModel.setCountry(eeeCountryModel());

        return beneficiaryModel;
    }

    public static AccountModel beneficiaryAccountModel() {
        AccountModel account = new AccountModel();
        account.setDescription(TEST_STRING);
        account.setAlias(TEST_STRING);
        account.setAvailability(TEST_STRING);
        account.setBic(TEST_BANK_BIC);
        account.setIban(TEST_IBAN);
        account.setNumber(ACCOUNT_NUMBER);
        account.setOwner(CUSTOMER_NAME);
        account.setProduct(TEST_SECOND_KEY_NUMBER);
        account.setJoint(TEST_STRING);
        account.setAmount(amountWithNumberModel());

        return account;
    }

    public static AccountModel eeeBeneficiaryAccountModel() {
        AccountModel account = new AccountModel();
        account.setDescription(TEST_STRING);
        account.setAlias(TEST_STRING);
        account.setAvailability(TEST_STRING);
        account.setBic(TEST_EEE_BANK_BIC);
        account.setIban(TEST_EEE_IBAN);
        account.setNumber(ACCOUNT_NUMBER);
        account.setOwner(CUSTOMER_NAME);
        account.setProduct(TEST_SECOND_KEY_NUMBER);
        account.setJoint(TEST_STRING);
        account.setAmount(amountWithNumberModel());

        return account;
    }

    public static BeneficiaryResultModel beneficiaryResultModel() {
        BeneficiaryResultModel beneficiaryResultModel = new BeneficiaryResultModel();

        beneficiaryResultModel.setBeneficiary(beneficiaryModel());

        return beneficiaryResultModel;
    }

    public static BlackListModel blacklistModel() {
        BlackListModel blackListModel = new BlackListModel();
        ArrayList<BlackListOperationModel> blackListOperationModel = new
                ArrayList<BlackListOperationModel>();
        for (int i = 0; i < BLACK_LIST_OPTIONS.length; i++) {
            BlackListOperationModel operation = new BlackListOperationModel();
            operation.setName(BLACK_LIST_OPTIONS[i]);
            if (i % 2 == 0) {
                operation.setStatus(BLACK_LIST_OPTION_OPEN);
            } else {
                operation.setStatus(BLACK_LIST_OPTION_CLOSE);
            }
            blackListOperationModel.add(operation);
        }
        blackListModel.setOperations(blackListOperationModel);
        return blackListModel;
    }

    public static CardActivationModel cardActivationModel() {
        CardActivationModel cardModel = new CardActivationModel();

        cardModel.setPin(TEST_CARD_ACTIVATION_PIN);

        return cardModel;
    }

    public static CardMovementsListModel cardMovementsListModel() {
        CardMovementsListModel model = new CardMovementsListModel();

        model.setAvailableBalance(amountModel());
        model.setCard(cardModel());
        model.setCardConfirmedMovements(cardMovements());
        model.setCardUnconfirmedMovements(unconfirmedCardMovements());
        model.setChargeAccount(accountModel());
        model.setContractNumber(TEST_CONTRACT);
        model.setContractOwner(TEST_STRING);
        model.setCurrentMonthBalance(amountModel());
        model.setPaginator(paginatorModel());
        model.setPaymentType(TEST_STRING);
        model.setPendingLiquidationBalance(amountModel());
        model.setPreviousBalance(amountModel());
        model.setPtorete(TEST_STRING);
        model.setTotalAmount(amountModel());
        model.setWillingBalance(amountModel());

        return model;
    }

    public static CardConditionsModel cardConditionsModel() {
        CardConditionsModel cardConditionsModel = new CardConditionsModel();
        cardConditionsModel.setAuthorizationLimit(amountWithNumberModel());
        cardConditionsModel.setChargeAccount(accountWithBankAccountNumberModel());
        cardConditionsModel.setCreditLimit(amountWithNumberModel());
        cardConditionsModel.setPaymentMode(cardPaymentModeModel());
        cardConditionsModel.setCanModify(true);
        cardConditionsModel.setContract(TEST_CONTRACT);
        cardConditionsModel.setInterestPercentage(TEST_INTEREST_PERCENTATGE);

        return cardConditionsModel;
    }

    public static CardPrepaidReloadAmountsModel cardPrepaidReloadAmountsModel() {
        CardPrepaidReloadAmountsModel cardPrepaidReloadAmountsModel = new
                CardPrepaidReloadAmountsModel();
        cardPrepaidReloadAmountsModel.setMaxAvailableAmount(amountWithNumberModel());
        cardPrepaidReloadAmountsModel.setMaxReloadAmount(amountWithNumberModel());

        return cardPrepaidReloadAmountsModel;
    }

    public static CardPrepaidReloadCommissionsModel cardPrepaidReloadCommissionsModel() {
        CardPrepaidReloadCommissionsModel cardPrepaidReloadCommissionsModel = new
                CardPrepaidReloadCommissionsModel();
        cardPrepaidReloadCommissionsModel.setBalanceRecoveryCommission(amountWithNumberModel());
        cardPrepaidReloadCommissionsModel.setReloadCommission(amountWithNumberModel());

        return cardPrepaidReloadCommissionsModel;
    }

    public static CardPrepaidReloadModel cardPrepaidReloadModel() {
        CardPrepaidReloadModel cardPrepaidReloadModel = new CardPrepaidReloadModel();
        cardPrepaidReloadModel.setAmount(amountWithNumberModel());
        cardPrepaidReloadModel.setContractCCC(TEST_CONTRACT_CCC);
        cardPrepaidReloadModel.setPrepaidCard(cardModel());

        return cardPrepaidReloadModel;
    }

    public static ArrayList<CardMovementModel> cardMovements() {
        ArrayList<CardMovementModel> movements =
                new ArrayList<CardMovementModel>(TEST_NUMBER_OF_ITEMS);

        for (int i = 0; i < TEST_NUMBER_OF_ITEMS; i++) {
            movements.add(cardMovementModel());
        }

        return movements;
    }

    public static ArrayList<CardMovementModel> unconfirmedCardMovements() {
        ArrayList<CardMovementModel> movements =
                new ArrayList<CardMovementModel>(TEST_NUMBER_OF_ITEMS);

        for (int i = 0; i < TEST_NUMBER_OF_ITEMS; i++) {
            movements.add(unconfirmedCardMovementModel());
        }

        return movements;
    }

    public static CardMovementModel cardMovementModel() {
        CardMovementModel cardMovement = new CardMovementModel();
        cardMovement.setAmount(amountModel());
        cardMovement.setConcept(TEST_MOVEMENT_CONCEPT);
        cardMovement.setDate(TEST_DATE);
        cardMovement.setCity(TEST_STRING);
        cardMovement.setCanSplit(true);
        cardMovement.setCommission(amountModel(COMMISSION_VALUE));
        cardMovement.setOriginAmount(amountModel(ORIGIN_AMOUNT_VALUE));
        cardMovement.setConfirmed(true);

        return cardMovement;
    }

    public static CardMovementModel unconfirmedCardMovementModel() {
        CardMovementModel cardMovement = cardMovementModel();
        cardMovement.setConfirmed(false);

        return cardMovement;
    }

    public static CardLastMovementModel cardLastMovement() {
        CardLastMovementModel model = new CardLastMovementModel();

        CardMovementModel lastModel = cardMovementModel();
        model.setCardMovement(lastModel);

        return model;
    }

    public static CardMovementGeoPointModel cardMovementsGeopointModel() {
        CardMovementGeoPointModel cardMovementGeoPointModel = new CardMovementGeoPointModel();

        cardMovementGeoPointModel.setCardMovements(cardMovements());

        return cardMovementGeoPointModel;
    }

    public static CardListModel cardListModel() {
        CardListModel cardListModel = new CardListModel();

        ArrayList<CardModel> cards = cardsList();
        cardListModel.setCards(cards);

        PaginatorModel paginatorModel = paginatorModel();
        cardListModel.setPaginator(paginatorModel);

        return cardListModel;
    }

    private static ArrayList<CardModel> cardsList() {
        ArrayList<CardModel> cards = new ArrayList<CardModel>(TEST_NUMBER_OF_ITEMS);
        cards.add(cardInactiveModel());
        cards.add(cardDebitModel());
        cards.add(cardPrepaidModel());
        for (int i = 3; i < TEST_NUMBER_OF_ITEMS; i++) {
            cards.add(cardModel());
        }
        return cards;
    }

    public static CardModel cardModel() {
        CardModel cardModel = new CardModel();
        cardModel.setAlias(CREDIT_CARD_ALIAS);
        cardModel.setName(CREDIT_CARD_ALIAS);
        cardModel.setCvv2(TEST_NUMBER);
        cardModel.setNumber(TEST_NUMBER);
        cardModel.setRealNumber(TEST_NUMBER);
        cardModel.setExpirationDate(TEST_DATE);
        cardModel.setBalance(amountModel());
        cardModel.setDescription(CREDIT_CARD_ALIAS);
        cardModel.setNumcard(TEST_NUMBER);
        cardModel.setProductType(CardModel.CREDIT);
        cardModel.setIsOwner(true);
        cardModel.setContractCCC(TEST_CONTRACT_CCC);
        cardModel.setNfcCard(nfcModel());
        return cardModel;
    }

    public static NfcModel nfcModel() {
        NfcModel nfcModel = new NfcModel();

        nfcModel.setActive(true);
        nfcModel.setExpirationDate(DATE_TEST);
        nfcModel.setNfc(true);

        return nfcModel;
    }

    private static CardModel cardInactiveModel() {
        CardModel cardModel = cardModel();
        cardModel.setCanActivate(true);
        return cardModel;
    }

    private static CardModel cardDebitModel() {
        CardModel cardModel = cardModel();
        cardModel.setProductType(CardModel.DEBIT);
        cardModel.setAlias(DEBIT_CARD_ALIAS);
        cardModel.setName(DEBIT_CARD_ALIAS);
        cardModel.setDescription(DEBIT_CARD_ALIAS);
        cardModel.setIsOwner(true);
        cardModel.setOperativeCode(TEST_OPERATIVE_CODE);
        return cardModel;
    }

    private static CardModel cardPrepaidModel() {
        CardModel cardModel = cardModel();
        cardModel.setProductType(CardModel.PREPAID);
        cardModel.setAlias(PREPAID_CARD_ALIAS);
        cardModel.setName(PREPAID_CARD_ALIAS);
        cardModel.setDescription(PREPAID_CARD_ALIAS);
        return cardModel;
    }

    public static CardMovementsCreditSplitPeriodsModel cardMovementsCreditSplitPeriodsModel() {
        CardMovementsCreditSplitPeriodsModel splitPeriodsModel = new
                CardMovementsCreditSplitPeriodsModel();
        PeriodModel period = periodModel();
        PeriodModel[] periods = new PeriodModel[PERIODS_COUNT];
        for (int i = 0; i < PERIODS_COUNT; i++) {
            periods[i] = period;
        }
        splitPeriodsModel.setPeriods(periods);

        return splitPeriodsModel;
    }

    public static CardMovementsDebitSplitPeriodsModel cardMovementsDebitSplitPeriodsModel() {
        CardMovementsDebitSplitPeriodsModel splitPeriodsModel = new
                CardMovementsDebitSplitPeriodsModel();
        PeriodModel period = periodModel();
        PeriodModel[] periods = new PeriodModel[PERIODS_COUNT];
        for (int i = 0; i < PERIODS_COUNT; i++) {
            periods[i] = period;
        }
        splitPeriodsModel.setPeriods(periods);

        return splitPeriodsModel;
    }

    public static CardSettlementsModel cardSettlementsModel() {
        CardSettlementsModel settlementsModel = new CardSettlementsModel();
        settlementsModel.setAccount(accountModel());

        ArrayList<CardSettlementModel> settlements = new ArrayList<CardSettlementModel>();
        settlements.add(cardSettlementModel());
        settlementsModel.setCardSettlements(settlements);

        return settlementsModel;
    }

    public static CardSettlementModel cardSettlementModel() {
        CardSettlementModel cardSettlement = new CardSettlementModel();
        cardSettlement.setSettlement(TEST_STRING);
        cardSettlement.setAmount(amountModel());
        cardSettlement.setPendingAmount(amountModel());
        cardSettlement.setSettlementId(TEST_STRING);
        cardSettlement.setDatePay(TEST_DATE);
        cardSettlement.setSettlementState(TEST_STRING);
        cardSettlement.setDateValue(TEST_DATE);

        return cardSettlement;
    }

    public static CardToAccountCommissionModel cardToAccountCommissionModel() {
        CardToAccountCommissionModel cardToAccountCommissionModel = new CardToAccountCommissionModel();
        CommissionModel commissionModel = new CommissionModel();
        AmountModel amountModel = new AmountModel();
        amountModel.setCurrency(IDKAmountFormatter.EURO_CODE);
        amountModel.setValue(TEST_AMOUNT_VALUE);
        commissionModel.setAmount(amountModel);
        commissionModel.setId(TEST_ID);
        AccountModel accountModel = new AccountModel();
        accountModel.setNumber(ACCOUNT_NUMBER);
        cardToAccountCommissionModel.setCommission(commissionModel);
        cardToAccountCommissionModel.setAccount(accountModel);

        return cardToAccountCommissionModel;
    }

    public static CardToAccountTransferModel cardToAccountTransferModel() {
        CardToAccountTransferModel transferModel = new CardToAccountTransferModel();
        AccountModel accountModel = new AccountModel();
        CommissionModel commissionModel = new CommissionModel();
        accountModel.setNumber(ACCOUNT_NUMBER);
        AmountModel amountModel = new AmountModel();
        amountModel.setCurrency(IDKAmountFormatter.EURO_CODE);
        amountModel.setValue(TEST_AMOUNT_VALUE);
        commissionModel.setAmount(amountModel);
        commissionModel.setId(TEST_ID);
        transferModel.setAmount(amountModel);
        transferModel.setCard(cardModel());
        transferModel.setCommission(commissionModel);
        transferModel.setAccount(accountModel);

        return transferModel;
    }

    public static CheckModel checkModel() {
        CheckModel checkModel = new CheckModel();

        checkModel.setAmount(amountModel());
        checkModel.setAccount(accountModel());
        checkModel.setCheckAccount(accountModel());
        checkModel.setCheckNumber(TEST_CHECK_NUMBER + "-" + TEST_CHECK_NUMBER_CONTROL_DIGIT);
        checkModel.setCheckType(TEST_CHECK_TYPE + "-" + TEST_CHECK_TYPE_CONTROL_DIGIT);
        checkModel.setCompany(companyModel());
        checkModel.setExpirationDate(TEST_DATE);
        checkModel.setPaymentDate(TEST_DATE);

        return checkModel;
    }

    private static CommissionModel commissionModel(int commissionIdType) {
        CommissionModel commissionModel = new CommissionModel();

        commissionModel.setAmount(amountModel());
        commissionModel.setId(TEST_COMMISSIONS_IDS[commissionIdType]);

        return commissionModel;
    }

    public static ArrayList<CommissionModel> commissions() {
        ArrayList<CommissionModel> commissions = new ArrayList<CommissionModel>();
        for (int i = 0; i < TEST_COMMISSIONS_LENGHT; i++) {
            commissions.add(commissionModel(i));
        }

        return commissions;
    }

    public static CommissionsModel commissionsModel() {
        CommissionsModel commissionsModel = new CommissionsModel();
        commissionsModel.setCommissions(commissions());
        commissionsModel.setMaxCutDate(TEST_COMMISSIONS_MAX_CUT_DATE);
        commissionsModel.setMaxCutTime(TEST_COMMISSIONS_MAX_CUT_TIME);
        commissionsModel.setNextCutDate(TEST_COMMISSIONS_NEXT_CUT_DATE);

        return commissionsModel;
    }

    public static CompanyModel companyModel() {
        CompanyModel companyModel = new CompanyModel();

        companyModel.setName(TEST_COMPANY_NAME);
        companyModel.setNif(TEST_COMPANY_NIF);

        return companyModel;
    }

    public static CompaniesListModel companiesListModel() {
        CompaniesListModel companiesListModel = new CompaniesListModel();

        ArrayList<CompanyModel> companies = new ArrayList<CompanyModel>();
        for (int i = 0; i < TEST_NUMBER_OF_ITEMS; i++) {
            companies.add(MockFactory.companyModel());
        }
        companiesListModel.setCompanies(companies);
        final PaginatorModel paginator = paginatorModel();
        paginator.setTotalItems(TEST_NUMBER_OF_ITEMS);
        paginator.setItemsPerPage(TEST_NUMBER_OF_ITEMS);
        paginator.setPage(1);
        companiesListModel.setPaginator(paginator);
        return companiesListModel;
    }

    public static CountriesListModel countriesListModel() {
        CountriesListModel countriesListModel = new CountriesListModel();

        ArrayList<CountryModel> countries = new ArrayList<CountryModel>();
        for (int i = 0; i < TEST_NUMBER_OF_ITEMS; ++i) {
            if (i % 2 == 0) {
                countries.add(countryModel());
            }
            else {
                countries.add(eeeCountryModel());
            }
        }

        countriesListModel.setCountries(countries);
        return countriesListModel;
    }

    public static CountryModel countryModel() {
        CountryModel countryModel = new CountryModel();

        countryModel.setName(TEST_COUNTRY_NAME);
        countryModel.setCode(TEST_COUNTRY_CODE);

        return countryModel;
    }

    public static CountryModel eeeCountryModel() {
        CountryModel countryModel = new CountryModel();

        countryModel.setName(TEST_EEE_COUNTRY_NAME);
        countryModel.setCode(TEST_EEE_COUNTRY_CODE);

        return countryModel;
    }

    public static CurrenciesModel currenciesModel() {
        CurrenciesModel currenciesModel = new CurrenciesModel();

        currenciesModel.setCurrencies(keyValueModelListForCurrencies());
        return currenciesModel;
    }

    public static DirectDebitListModel directDebitListModel() {
        DirectDebitListModel directDebitListModel = new DirectDebitListModel();

        ArrayList<DirectDebitModel> directDebitModels = new ArrayList<DirectDebitModel>();
        for (int i = 0; i < TEST_NUMBER_OF_ITEMS; i++) {
            directDebitModels.add(directDebitModel());
        }
        directDebitListModel.setDirectDebits(directDebitModels);
        directDebitListModel.setPaginator(paginatorModel());

        return directDebitListModel;
    }

    public static DirectDebitModel directDebitModel() {
        DirectDebitModel model = new DirectDebitModel();
        model.setAccount(accountModel());
        model.setAmount(amountModel());
        model.setStatus(DIRECT_DEBIT_STATUS);
        model.setInitDate(TEST_DATE);
        model.setContract(DIRECT_DEBIT_CONTRACT);
        model.setDebtor(DIRECT_DEBIT_DEBTOR);
        model.setLastDate(TEST_DATE);
        model.setIssuer(DIRECT_DEBIT_ISSUER);
        model.setNumOp(DIRECT_DEBIT_NUMOP);
        model.setPay(DIRECT_DEBIT_PAY);
        model.setReference(DIRECT_DEBIT_REFERENCE);
        return model;
    }

    public static DocumentModel documentModel() {
        DocumentModel model = new DocumentModel();

        model.setContent(TEST_STRING);
        model.setId(TEST_STRING);
        model.setName(DOCUMENT_NAME);
        model.setText(TEST_STRING);
        model.setUrl("");

        return model;
    }

    public static DocumentModel documentGeneralConditionsModel() {
        DocumentModel documentModel = new DocumentModel();
        documentModel.setText(MockFactory.GENERAL_CONDITIONS);
        return documentModel;
    }

    public static DocumentModel documentSpecificConditionsModel() {
        DocumentModel documentModel = new DocumentModel();
        documentModel.setText(MockFactory.SPECIFIC_CONDITIONS);
        return documentModel;
    }

    public static DollarDatesModel dollarDatesModel() {
        DollarDatesModel dollarDatesModel = new DollarDatesModel();

        dollarDatesModel.setCanSelectDate(true);
        dollarDatesModel.setKeyValues(keyValueModelList());

        return dollarDatesModel;
    }

    public static KeyModel keyModel(boolean operationHasRisk) {
        KeyModel keyModel = new KeyModel();
        if (!operationHasRisk) {
            keyModel.setNumber(TEST_SECOND_KEY_NUMBER);
        }
        keyModel.setSignPending(false);
        keyModel.setSmsEnabled(operationHasRisk);

        return keyModel;
    }

    public static OtpQueryKeyModel otpQueryKeyModel(boolean operationHasRisk) {
        OtpQueryKeyModel keyModel = new OtpQueryKeyModel();
        if (!operationHasRisk) {
            keyModel.setNumber(TEST_SECOND_KEY_NUMBER);
        }
        keyModel.setSignPending(false);
        keyModel.setSmsEnabled(operationHasRisk);

        return keyModel;
    }

    public static KeyModel keyModelVtpc(boolean operationHasRisk) {
        KeyModel keyModel = new KeyModel();

        keyModel.setSmsEnabled(operationHasRisk);
        keyModel.setNumber(TPC_KEY_NUMBER);
        keyModel.setTpcEnabled(true);
        if (operationHasRisk) {
            keyModel.setReferOTP(VTPC_REFER_OTP_RISK);
        } else {
            keyModel.setReferOTP(VTPC_REFER_OTP);
        }

        return keyModel;
    }

    public static KeyModel keyModelVtpc2() {
        KeyModel keyModel = new KeyModel();

        keyModel.setSmsEnabled(true);
        keyModel.setTpcEnabled(false);
        keyModel.setNumber(TEST_SECOND_KEY_NUMBER);
        keyModel.setCardCodes(cardCodes());

        return keyModel;
    }

    public static KeyModel keyModelVtpcPassword(boolean operationHasRisk) {
        KeyModel keyModel = keyModelVtpc(operationHasRisk);
        keyModel.setPassword(TPC_CODE);

        return keyModel;
    }

    public static ContractResponseModel contractResponseModel() {
        ContractResponseModel contractResponseModel = new ContractResponseModel();
        contractResponseModel.setTelephone(telephoneModel());
        contractResponseModel.setEmail(USER_EMAIL);

        return contractResponseModel;
    }

    public static TelephoneModel telephoneModel() {
        TelephoneModel model = new TelephoneModel();

        model.setPrefix(VTPC_PHONE_PREFIX);
        model.setNumber(VTPC_PHONE);

        return model;
    }

    public static ArrayList<CardCodeModel> cardCodes() {
        ArrayList<CardCodeModel> cardCodes = new ArrayList<CardCodeModel>();
        for (int i = 0; i < TEST_SECOND_KEY_CODES_SIZE; ++i) {
            cardCodes.add(cardCode(i + 1));
        }

        return cardCodes;
    }

    public static ArrayList<String> cardCodesAsString() {
        ArrayList<String> cardCodes = new ArrayList<String>();
        for (int i = 0; i < TEST_SECOND_KEY_CODES_SIZE; ++i) {
            cardCodes.add(String.valueOf(TEST_SECOND_KEY_VALUE + i));
        }

        return cardCodes;
    }

    private static CardCodeModel cardCode(int code) {
        CardCodeModel cardCodeModel = new CardCodeModel();

        cardCodeModel.setCode(String.valueOf(code));
        cardCodeModel.setValue(String.valueOf(TEST_SECOND_KEY_VALUE + code));

        return cardCodeModel;
    }

    public static AccountModel accountWithBankAccountNumberModel() {
        AccountModel account = new AccountModel();
        account.setDescription("");
        account.setAlias("");
        account.setAvailability(TEST_STRING);
        account.setBic(TEST_STRING);
        account.setIban("");
        account.setNumber(TEST_ACCOUNT_BANK_ACCOUNT_NUMBER);
        account.setOwner(TEST_STRING);
        account.setProduct(TEST_SECOND_KEY_NUMBER);
        account.setJoint(TEST_STRING);
        account.setAmount(amountModel());

        return account;
    }

    public static TpcKeyListModel tpcKeyListModel() {
        TpcKeyListModel model = new TpcKeyListModel();

        List<TpcKey> tpcKeys = new ArrayList<TpcKey>();
        for (int i = 0; i < TEST_NUMBER_OF_ITEMS; i++) {
            tpcKeys.add(tpcKeyModel());
        }
        model.setTpcKeys(tpcKeys);

        return model;
    }

    public static TpcKey tpcKeyModel() {
        TpcKey model = new TpcKey();

        model.setCode(TPC_CODE);
        model.setExpirationDate(DATE_TEST);

        return model;
    }

    public static OwnTransferModel ownTransferModel() {
        OwnTransferModel ownTransferModel = new OwnTransferModel();
        ownTransferModel.setAmount(amountWithNumberModel());
        ownTransferModel.setOperationNumber(TEST_NUMBER);
        ownTransferModel.setOriginAccount(accountModel());
        ownTransferModel.setTargetAccount(accountModelOther());

        return ownTransferModel;
    }

    public static OwnTransferResponseModel ownTransferResponseModel() {
        OwnTransferResponseModel ownTransferResponseModel = new OwnTransferResponseModel();
        ownTransferResponseModel.setTransfer(ownTransferModel());

        return ownTransferResponseModel;
    }

    public static TransferResponseModel transferNationalResponseModel() {
        TransferResponseModel transferResponseModel = new TransferResponseModel();

        transferResponseModel.setTransfer(transferNationalModel());

        return transferResponseModel;
    }

    public static TransferResponseModel transferInterationalResponseModel() {
        TransferResponseModel transferResponseModel = new TransferResponseModel();

        transferResponseModel.setTransfer(transferInternationalModel());

        return transferResponseModel;
    }

    public static TransferModel transferModel() {
        TransferModel transferModel = new TransferModel();

        transferModel.setAmount(amountModel());
        transferModel.setAccount(accountModel());
        transferModel.setAccountPayer(accountPayer());
        transferModel.setBeneficiary(beneficiaryModel());
        transferModel.setDate(TEST_DATE);
        transferModel.setPurpose(TEST_STRING);
        transferModel.setSalary(false);
        transferModel.setSequenceNumber(TEST_STRING);
        transferModel.setOperationNumber(TEST_OPERATION_NUMBER);
        transferModel.setTotalAmount(amountWithNumberModel());
        transferModel.setTransferCommission(amountWithNumberModel());
        transferModel.setCommissionCode(TEST_STRING);
        transferModel.setCancelCommission(amountWithNumberModel());
        transferModel.setCessionCode(TEST_STRING);
        transferModel.setCessionDesc(TEST_STRING);
        transferModel.setDollarDate(TEST_STRING);
        transferModel.setDollarDateRange(TEST_STRING);

        return transferModel;
    }

    public static TransferModel transferNationalModel() {
        TransferModel transferNationalModel = transferModel();

        transferNationalModel.setNational(true);

        return transferNationalModel;
    }

    public static TransferModel transferInternationalModel() {
        TransferModel transferNationalModel = transferModel();

        transferNationalModel.setNational(false);

        return transferNationalModel;
    }

    public static TransfersListModel transferListModel() {
        TransfersListModel transfersListModel = new TransfersListModel();

        ArrayList<TransferModel> transfers = new ArrayList<TransferModel>();
        for (int i = 0; i < TEST_NUMBER_OF_ITEMS; i++) {
            transfers.add(transferNationalModel());
        }
        transfersListModel.setTransfers(transfers);
        transfersListModel.setPaginator(paginatorModel());

        return transfersListModel;
    }

    public static PeriodModel periodModel() {
        PeriodModel period = new PeriodModel();
        period.setCode(CODE);
        period.setAmount(amountModel());
        period.setInterest(INTEREST);
        period.setMonths(MONTHS);
        period.setTae(TAE);
        return period;
    }

    public static PeriodicalTransferResponseModel periodicalTransferResponseModel() {
        PeriodicalTransferResponseModel responseModel = new PeriodicalTransferResponseModel();
        responseModel.setPeriodicalTransfer(periodicalTransferModel());
        return responseModel;
    }

    public static StringResponseModel periodicalTransferEndDateResponseModel() {
        StringResponseModel responseModel = new StringResponseModel();
        responseModel.setResult(DATE_TEST);
        return responseModel;
    }

    public static PeriodicalTransferModel periodicalTransferModel() {
        PeriodicalTransferModel transferModel = new PeriodicalTransferModel();
        transferModel.setAmount(amountWithNumberModel());
        transferModel.setPeriodicity(TEST_PERIODICITY);
        transferModel.setStartDate(TEST_DATE);
        transferModel.setEndDate(TEST_DATE);
        transferModel.setAccount(accountModel());
        transferModel.setAccountPayer(accountPayer());
        transferModel.setBeneficiary(beneficiaryModel());
        transferModel.setPeriodicityCode(TEST_PERIODICITY_CODE);
        transferModel.setPurpose(TEST_STRING);

        return transferModel;
    }

    public static TransferPeriodicalInfoModel transferPeriodicalInfoModel() {
        TransferPeriodicalInfoModel periodicalInfoModel = new TransferPeriodicalInfoModel();

        periodicalInfoModel.setEndDate(TEST_DATE);
        periodicalInfoModel.setStartDate(TEST_DATE);
        periodicalInfoModel.setEndingCode(TEST_CODE);
        periodicalInfoModel.setEndingText(TEST_STRING);
        periodicalInfoModel.setPeriodicity(TEST_PERIODICITY);
        periodicalInfoModel.setPeriodicityCode(TEST_CODE);
        periodicalInfoModel.setPeriodicityText(TEST_STRING);
        periodicalInfoModel.setRepetitions(TEST_NUMBER);

        return periodicalInfoModel;
    }

    public static AmountModel amountWithNumberModel() {
        AmountModel amount = new AmountModel();
        amount.setCurrency(TEST_AMOUNT_CURRENCY);
        amount.setValue(TEST_AMOUNT_VALUE);

        return amount;
    }

    public static BanksModel banksModel() {
        BanksModel banks = new BanksModel();

        banks.setBanks(keyValueModelList());

        return banks;
    }

    public static BicsModel bicsModel() {
        BicsModel bics = new BicsModel();

        ArrayList<String> bicList = new ArrayList<String>();
        for (int i = 0; i < TEST_NUMBER_OF_ITEMS; ++i) {
            bicList.add(TEST_BANK_BIC);
        }
        bics.setBics(bicList);

        return bics;
    }

    public static CitiesModel citiesModel() {
        CitiesModel banks = new CitiesModel();

        banks.setCities(keyValueModelList());

        return banks;
    }

    public static ProductsListModel productsModel() {
        AmountModel amount = amountModel();
        ArrayList<AccountModel> accounts = accounts();

        ProductsListModel productsModel = new ProductsListModel();

        AccountProductModel accountProduct = new AccountProductModel();
        accountProduct.setAmounts(amountCurrenciesList());
        accountProduct.setAccounts(accountsMixCurrencies());
        productsModel.setAccountProduct(accountProduct);

        CardListModel cardListModel = cardListModel();
        ArrayList<CardModel> cards = cardListModel.getCards();
        CardProductModel cardProduct = new CardProductModel();
        cardProduct.setAmount(amount);
        cardProduct.setCards(cards);
        productsModel.setCardProduct(cardProduct);

        // INVESTMENT
        AccountFinancialModel pensionPlan = new AccountFinancialModel();
        pensionPlan.setAmount(amount);
        pensionPlan.setAccounts(accounts);

        IPFFinancialModel ipfFinancialModel = new IPFFinancialModel();
        ipfFinancialModel.setAmount(amount);
        ipfFinancialModel.setPolicies(policies());

        DepositProductModel depositProduct = new DepositProductModel();
        depositProduct.setAmount(amount);
        depositProduct.setAccounts(accounts);

        AccountFinancialModel accountFinancialModel = new AccountFinancialModel();
        accountFinancialModel.setAmount(amount);
        accountFinancialModel.setAccounts(accounts);

        InvestmentProductModel investmentProduct = new InvestmentProductModel();
        investmentProduct.setAmount(amount);
        investmentProduct.setPensionPlan(accountFinancialModel);
        investmentProduct.setDepositProduct(depositProduct);
        investmentProduct.setInvestmentFund(accountFinancialModel);
        investmentProduct.setInsuredPlanForecast(ipfFinancialModel);
        investmentProduct.setUnknowns(unknownListModel());

        productsModel.setInvestmentProduct(investmentProduct);

        // FINANCIAL
        AccountLoanModel loanProduct = new AccountLoanModel();
        loanProduct.setAmount(amount);
        loanProduct.setAccounts(accounts);

        AccountCreditModel creditProduct = new AccountCreditModel();
        creditProduct.setAmount(amount);
        creditProduct.setAccounts(accounts);

        ExpansionLineGPModel expansionLineGP = new ExpansionLineGPModel();
        expansionLineGP.setAmount(amount);
        expansionLineGP.setExpansionLines(expansionLines());

        FinancialProductModel financialProduct = new FinancialProductModel();
        financialProduct.setAmount(amount);
        financialProduct.setLoan(loanProduct);
        financialProduct.setCredit(creditProduct);
        financialProduct.setExpansionLineGP(expansionLineGP);
        productsModel.setFinancialProduct(financialProduct);

        return productsModel;
    }

    private static ArrayList<AmountModel> amountCurrenciesList() {
        ArrayList<AmountModel> amountCurrencies = new ArrayList<AmountModel>();

        AmountModel euroAmountModel = amountModel();
        amountCurrencies.add(euroAmountModel);

        AmountModel usdAmountModel = amountModel();
        usdAmountModel.setValue(ORIGIN_AMOUNT_VALUE);
        usdAmountModel.setCurrency(IDKAmountFormatter.DOLLAR_CODE);
        amountCurrencies.add(usdAmountModel);

        AmountModel poundAmountModel = amountModel();
        poundAmountModel.setCurrency(IDKAmountFormatter.POUND_CODE);
        amountCurrencies.add(poundAmountModel);

        return amountCurrencies;
    }

    private static ArrayList<UnknownModel> unknownListModel() {
        UnknownListModel list = new UnknownListModel();
        ArrayList<UnknownModel> unknowns = list.getUnknowns();
        for (int i = 0; i < TEST_NUMBER_OF_ITEMS; i++) {
            unknowns.add(unknownModel());
        }
        return null;
    }

    private static UnknownModel unknownModel() {
        UnknownModel model = new UnknownModel();
        model.setAmount(amountModel());
        model.setDescription(TEST_STRING);

        return model;
    }

    private static ArrayList<PolicyModel> policies() {
        ArrayList<PolicyModel> policies = new ArrayList<PolicyModel>();
        for (int i = 0; i < TEST_NUMBER_OF_ITEMS; i++) {
            policies.add(policyModel());
        }

        return policies;
    }

    private static PolicyModel policyModel() {
        PolicyModel policyModel = new PolicyModel();
        policyModel.setAmount(amountWithNumberModel());
        policyModel.setCertifiedNumber(TEST_NUMBER);
        policyModel.setCode(TEST_STRING);
        policyModel.setOwner(TEST_STRING);
        policyModel.setProductCode(TEST_STRING);
        policyModel.setProductDesc(TEST_STRING);
        policyModel.setProductType(TEST_STRING);

        return policyModel;
    }

    private static ArrayList<ExpansionLineModel> expansionLines() {
        ArrayList<ExpansionLineModel> expansionLines = new ArrayList<ExpansionLineModel>();
        for (int i = 0; i < TEST_NUMBER_OF_ITEMS; i++) {
            expansionLines.add(expansionLineModel());
        }

        return expansionLines;
    }

    private static ExpansionLineModel expansionLineModel() {
        ExpansionLineModel expansionLineModel = new ExpansionLineModel();
        expansionLineModel.setActive(true);
        expansionLineModel.setAvailableBalance(amountWithNumberModel());
        expansionLineModel.setClaimFee(amountWithNumberModel());
        expansionLineModel.setContractCCC(TEST_CONTRACT_CCC);
        expansionLineModel.setCreditLimit(amountWithNumberModel());
        expansionLineModel.setDescription(TEST_STRING);
        expansionLineModel.setExpansionAccount(accountModel());
        expansionLineModel.setInterest(TEST_STRING);
        expansionLineModel.setMinDisposeAmount(amountWithNumberModel());
        expansionLineModel.setNumber(TEST_NUMBER);
        expansionLineModel.setNumCard(TEST_NUMBER);
        expansionLineModel.setOpeningFee(amountWithNumberModel());
        expansionLineModel.setOwner(TEST_STRING);
        expansionLineModel.setReference(TEST_STRING);
        expansionLineModel.setExpansionAccount(accountModel());
        expansionLineModel.setInterest(TEST_STRING);
        expansionLineModel.setMinDisposeAmount(amountWithNumberModel());
        expansionLineModel.setTae(TEST_STRING);

        return expansionLineModel;
    }

    public static PaginatorModel paginatorModel() {
        PaginatorModel paginatorModel = new PaginatorModel();
        paginatorModel.setTotalItems(TEST_NUMBER_OF_ITEMS);
        paginatorModel.setItemsPerPage(3);
        paginatorModel.setPage(1);
        paginatorModel.setOrder(PaginatorOrder.ASC.toString());

        return paginatorModel;
    }

    public static PaginatorModel emptyPaginatorModel() {
        PaginatorModel paginatorModel = new PaginatorModel();
        paginatorModel.setTotalItems(0);
        paginatorModel.setItemsPerPage(0);
        paginatorModel.setPage(1);
        paginatorModel.setOrder(PaginatorOrder.ASC.toString());

        return paginatorModel;
    }

    public static OfficeListModel officesListModel() {
        OfficeListModel model = new OfficeListModel();

        List<OfficeModel> officeModels = new ArrayList<OfficeModel>();
        officeModels.add(officeModel());
        officeModels.add(officeModel());
        officeModels.add(officeModel());
        officeModels.add(officeModel());
        officeModels.add(officeModel());

        model.setOffices(officeModels);
        model.setPoint(geoPointModel());

        return model;
    }

    public static OfficeModel officeModel() {
        OfficeModel model = new OfficeModel();

        model.setDistToPoint(OFFICE_DIST_TO_POINT);
        model.setNum(OFFICE_NUM);
        model.setName(OFFICE_NAME);
        model.setAddress(OFFICE_ADDRESS);
        model.setLocation(OFFICE_LOCATION);
        model.setPostalCode(OFFICE_POSTAL_CODE);
        model.setDirector(OFFICE_DIRECTOR);
        model.setPhone(OFFICE_PHONE);
        model.setFax(OFFICE_PHONE);
        model.setType(OFFICE_TYPE);
        model.setPoint(geoPointModel());

        return model;
    }

    public static GeoPointModel geoPointModel() {
        GeoPointModel geoPointModel = new GeoPointModel();

        geoPointModel.setLat(OFFICE_LAT);
        geoPointModel.setLng(OFFICE_LNG);

        return geoPointModel;
    }

    public static CardPaymentModeModel cardPaymentModeModel() {
        CardPaymentModeModel cardPaymentModeModel = new CardPaymentModeModel();
        cardPaymentModeModel.setAmount(amountWithNumberModel());
        cardPaymentModeModel.setId(TEST_PAYMENT_MODE_ID);

        return cardPaymentModeModel;
    }

    public static AccountMovementModel accountMovementModel() {
        AccountMovementModel movement = new AccountMovementModel();
        movement.setConcept(TEST_MOVEMENT_CONCEPT);
        movement.setAmount(amountModel());
        movement.setCanSplit(false);
        movement.setBalance(amountModel());
        movement.setExistDocument(false);
        movement.setApuntNumber(TEST_STRING);
        movement.setProductCode(TEST_STRING);
        movement.setValueDate(TEST_DATE);
        movement.setConceptDetail(TEST_MOVEMENT_CONCEPT);
        movement.setTimeStamp(TEST_NUMBER);
        movement.setReferencor(TEST_STRING);
        movement.setSessionDate(TEST_DATE);
        movement.setDate(TEST_DATE);
        movement.setValueDate(TEST_DATE);

        return movement;
    }

    public static AccountMovementsListModel accountMovementsListModel() {
        AccountMovementsListModel movementsList = new AccountMovementsListModel();

        movementsList.setAccount(accountModel());
        ArrayList<AccountMovementModel> movements = new ArrayList<AccountMovementModel>();
        for (int i = 0; i < TEST_NUMBER_OF_ITEMS; i++) {
            movements.add(accountMovementModel());
        }
        // movementsList.setAccount(accountModel());
        movementsList.setMovements(movements);

        return movementsList;
    }

    public static AccountsListModel accountListModel() {
        AccountsListModel accountsList = new AccountsListModel();
        accountsList.setAccounts(accounts());
        accountsList.setPaginator(paginatorModel());

        return accountsList;
    }

    public static CardProfileRulesListModel cardProfileRulesListModel() {
        CardProfileRulesListModel profileRulesListModel = new CardProfileRulesListModel();

        CardProfileRuleModel ruleForeign = new CardProfileRuleModel();
        ruleForeign.setActive(RULE_STATUS_INACTIVE);
        ruleForeign.setCode(FOREIGN_RULE);
        ruleForeign.setName(TEST_STRING);
        CardProfileRuleModel ruleInternet = new CardProfileRuleModel();
        ruleInternet.setActive(RULE_STATUS_ACTIVE);
        ruleInternet.setCode(INTERNET_RULE);
        ruleInternet.setName(TEST_STRING);

        ArrayList<CardProfileRuleModel> rules = new ArrayList<CardProfileRuleModel>();
        rules.add(ruleForeign);
        rules.add(ruleInternet);
        profileRulesListModel.setRules(rules);

        return profileRulesListModel;
    }

    public static CardProfileCountriesListModel cardProfileCountriesListModel() {
        CardProfileCountriesListModel profileCountriesListModel = new
                CardProfileCountriesListModel();
        ArrayList<CountryModel> countries = new ArrayList<CountryModel>();
        for (int i = 0; i < TEST_NUMBER_OF_ITEMS; i++) {
            CountryModel countryModel = new CountryModel();
            countryModel.setName(TEST_STRING);
            countryModel.setCode(TEST_CODE);
            countries.add(countryModel);
        }
        profileCountriesListModel.setCountries(countries);

        return profileCountriesListModel;
    }

    public static BooleanResponseModel booleanResponseModel() {
        BooleanResponseModel booleanResponseModel = new BooleanResponseModel();
        booleanResponseModel.setResult(true);

        return booleanResponseModel;
    }

    public static PushMessageModel pushMessageModel() {
        PushMessageModel pushMessageModel = new PushMessageModel();
        pushMessageModel.setData(TEST_STRING);
        pushMessageModel.setIdMsg(ID_MSG);
        pushMessageModel.setIdMsgExt(ID_MSG_EXT);
        pushMessageModel.setDeleted(false);
        pushMessageModel.setReaded(true);
        pushMessageModel.setRefApp(REF_APP);
        pushMessageModel.setTsCreate(TS_CREATE);
        pushMessageModel.setTsTrans("");
        KeyValueModel userModel = new KeyValueModel();
        userModel.setKey("");
        userModel.setValue("");
        pushMessageModel.setUser(userModel);

        return pushMessageModel;
    }

    public static PushMessageListModel pushMessageListModel() {
        PushMessageListModel pushMessageListModel = new PushMessageListModel();
        ArrayList<PushMessageModel> pushMessages = new ArrayList<PushMessageModel>();
        for (int i = 0; i < TEST_NUMBER_OF_ITEMS; i++) {
            pushMessages.add(pushMessageModel());
        }
        pushMessageListModel.setMessages(pushMessages);
        pushMessageListModel.setTsTo(TS_CREATE);
        pushMessageListModel.setMoreElements(false);

        return pushMessageListModel;
    }

    public static AlertContractModel alertContractModel() {
        AlertContractModel alertContractModel = new AlertContractModel();
        alertContractModel.setAuthorized("");
        alertContractModel.setContractNumber(TEST_CONTRACT);
        alertContractModel.setEmail("");
        alertContractModel.setEnvironment(TEST_STRING);
        alertContractModel.setInitialDate(DATE_TEST);
        alertContractModel.setLastPrintDate(DATE_TEST);
        alertContractModel.setNif(TEST_COMPANY_NIF);
        alertContractModel.setOwner(TEST_STRING);
        alertContractModel.setPersonNumber(TEST_NUMBER);
        alertContractModel.setPhone(AGENT_PHONE);
        alertContractModel.setPush(TEST_NUMBER);
        alertContractModel.setType(PUSH_TYPE);

        return alertContractModel;
    }

    public static PushDeviceModel pushDeviceModel() {
        PushDeviceModel pushDeviceModel = new PushDeviceModel();
        pushDeviceModel.setAppVersion(TEST_NUMBER);
        pushDeviceModel.setApplication(TEST_STRING);
        pushDeviceModel.setChannelProvider(TEST_STRING);
        pushDeviceModel.setDevModel(TEST_STRING);
        pushDeviceModel.setDevVendor(TEST_STRING);
        pushDeviceModel.setIdDevice(TEST_NUMBER);
        pushDeviceModel.setIdUser(TEST_NUMBER);
        pushDeviceModel.setOsVendor(TEST_STRING);
        pushDeviceModel.setOsVersion(TEST_NUMBER);
        pushDeviceModel.setToken(TEST_STRING);
        pushDeviceModel.setTsCreate(TS_CREATE);
        pushDeviceModel.setUuidDevice(TEST_NUMBER);

        return pushDeviceModel;
    }

    public static PushDeviceResponseModel pushDeviceResponseModel() {
        PushDeviceResponseModel model = new PushDeviceResponseModel();
        model.setDevice(pushDeviceModel());
        return model;
    }

    public static PushDeviceListModel pushDeviceListModel() {
        PushDeviceListModel pushDeviceListModel = new PushDeviceListModel();
        ArrayList<PushDeviceModel> deviceModels = new ArrayList<PushDeviceModel>();
        for (int i = 0; i < TEST_NUMBER_OF_ITEMS; i++) {
            deviceModels.add(pushDeviceModel());
        }
        pushDeviceListModel.setDevices(deviceModels);

        return pushDeviceListModel;
    }

    public static RiskRecordListModel riskRecordListModel() {
        RiskRecordListModel riskRecordListModel = new RiskRecordListModel();

        riskRecordListModel.setRecords(riskRecordsList());
        riskRecordListModel.setMoreElements(false);
        riskRecordListModel.setTsTo(String.valueOf(System.currentTimeMillis()));

        return riskRecordListModel;
    }

    public static List<RiskRecordModel> riskRecordsList() {
        List<RiskRecordModel> riskRecords = new ArrayList<RiskRecordModel>();
        for (int i = 0; i < TEST_NUMBER_OF_ITEMS; ++i) {
            riskRecords.add(riskRecordModel());
        }

        return riskRecords;
    }

    public static RiskRecordModel riskRecordModel() {
        RiskRecordModel riskRecordModel = new RiskRecordModel();
        riskRecordModel.setDeliveryDate(TEST_DATE);
        riskRecordModel.setEndDate(TEST_DATE);
        riskRecordModel.setMaxDate(TEST_DATE);
        riskRecordModel.setRequestDate(TEST_DATE);
        riskRecordModel.setNumber(TEST_NUMBER);
        riskRecordModel.setStatus(RiskRecordModel.STATUS_DOC_PENDING);
        riskRecordModel.setProducts(riskProductsList());

        return riskRecordModel;
    }

    public static List<RiskProductModel> riskProductsList() {
        List<RiskProductModel> riskProducts = new ArrayList<RiskProductModel>();
        for (int i = 0; i < TEST_NUMBER_OF_ITEMS; ++i) {
            riskProducts.add(riskProductModel());
        }

        return riskProducts;
    }

    public static RiskProductModel riskProductModel() {
        RiskProductModel riskProductModel = new RiskProductModel();
        riskProductModel.setAmount(amountWithNumberModel());
        riskProductModel.setCode(TEST_CODE);
        riskProductModel.setDescription(TEST_STRING);

        return riskProductModel;
    }

    public static StringResponseModel stringResponseModel() {
        StringResponseModel stringResponseModel = new StringResponseModel();

        stringResponseModel.setResult(TEST_STRING_RESPONSE_PIN_REC);

        return stringResponseModel;
    }

    public static NfcSignUpCardModel nfcSignUpCardModel() {
        NfcSignUpCardModel nfcSignUpCardModel = new NfcSignUpCardModel();

        nfcSignUpCardModel.setUserId(TEST_WALLET_NFC_USER_ID);

        return nfcSignUpCardModel;
    }

    public static ArrayList<KeyValueModel> keyValueModelList() {
        ArrayList<KeyValueModel> keyValues = new ArrayList<KeyValueModel>();

        for (int i = 0; i < TEST_NUMBER_OF_ITEMS; ++i) {
            keyValues.add(keyValueModel());
        }

        return keyValues;
    }

    public static KeyValueModel keyValueModel() {
        KeyValueModel keyValue = new KeyValueModel();
        keyValue.setKey(TEST_STRING);
        keyValue.setValue(TEST_STRING);

        return keyValue;
    }

    public static ArrayList<KeyValueModel> keyValueModelListForCurrencies() {
        ArrayList<KeyValueModel> keyValues = new ArrayList<KeyValueModel>();

        for (int i = 0; i < TEST_NUMBER_OF_ITEMS; ++i) {
            keyValues.add(keyValueModelForCurrencies());
        }

        return keyValues;
    }

    public static KeyValueModel keyValueModelForCurrencies() {
        KeyValueModel keyValue = new KeyValueModel();
        keyValue.setKey(IDKAmountFormatter.EURO_CODE);
        keyValue.setValue(IDKAmountFormatter.EURO_CODE);

        return keyValue;
    }

    public static AccountTransferToCardModel accountTransferToCardModel() {
        AccountTransferToCardModel accountTransferToCardModel = new AccountTransferToCardModel();
        accountTransferToCardModel.setAccount(accountModel());
        accountTransferToCardModel.setCard(cardModel());
        accountTransferToCardModel.setAmount(amountModel());

        return accountTransferToCardModel;
    }

    public static UserModel userModel() {
        UserModel model = new UserModel();

        model.setContractNumber(USER_CONTRACT_NUMBER);
        model.setCustomization(USER_CUSTOMIZATION);
        model.setDni(USER_DNI);
        model.setHasMoreContracts(USER_HAS_MORE_CONTRACTS);
        model.setIdType(USER_ID_TYPE);
        model.setLoginType(LOGIN_TYPE_INDIVIDUAL);
        model.setNewUser(USER_IS_NEW_USER);
        model.setName(USER_NAME);
        model.setPendingSignOperations(USER_PENDING_SIGN_OPERATIONS);
        model.setPersonNumber(USER_PERSON_NUMBER1);
        model.setPhoneNumber(USER_PHONE_NUMBER);
        model.setPromoLayer(promoLayer());
        model.setSex(USER_SEX);
        model.setSignatureType(UserModel.SIGNATURE_TYPE_TPC);

        return model;
    }

    private static PromoLayerModel promoLayer() {
        PromoLayerModel model = new PromoLayerModel();

        model.setCode(PROMO_LAYER_CODE);
        model.setUrl(PROMO_LAYER_URL);
        model.setnShows(PROMO_LAYER_SHOWS);
        model.setExist(PROMO_LAYER_EXIST);

        return model;
    }

    public static PromoLayerResultModel promoLayerResultModel() {
        PromoLayerResultModel model = new PromoLayerResultModel();
        model.setPromoLayer(promoLayer());

        return model;
    }

    public static AlertContractListModel alertContractListModel() {
        AlertContractListModel alertContractListModel = new AlertContractListModel();

        ArrayList<AlertContractModel> contracts = new ArrayList<AlertContractModel>();
        for (int i = 0; i < TEST_NUMBER_OF_ITEMS; ++i) {
            contracts.add(alertContractModel());
        }

        alertContractListModel.setContracts(contracts);

        return alertContractListModel;
    }

    public static TransferCancelModel cancelTransferModel() {
        TransferCancelModel model = new TransferCancelModel();
        model.setPendingOffice(false);

        return model;
    }

    public static InstantMoneyModel instantMoneyModel() {
        InstantMoneyModel model = new InstantMoneyModel();
        model.setAmount(amountModel());
        model.setCard(cardModel());
        model.setCommissions(commissions());
        model.setCode(TEST_CODE);
        model.setTime(TEST_TIME);
        model.setDate(TEST_DATE);
        model.setPhoneNumber(USER_PHONE_NUMBER);
        model.setPurpose(TEST_PURPOSE);

        return model;
    }

    public static ErrorResponse instantMoneyErrorResponseModel() {
        // Uncomment this line to return an instant money disabled response.
        //errorListener.onErrorResponse(MockFactory.instantMoneyErrorResponseModel());
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setInstantMoneyDisabled(true);
        return errorResponse;
    }

    public static InstantMoneyCommissionsModel instantMoneyCommissionsModel() {
        InstantMoneyCommissionsModel model = new InstantMoneyCommissionsModel();
        model.setCommissions(commissions());

        return model;
    }

    public static StatusModel statusModel() {
        StatusModel model = new StatusModel();

        model.setLogged(STATUS_LOGGED);
        model.setVersion(versionModel());

        return model;
    }

    public static VersionModel versionModel() {
        VersionModel model = new VersionModel();

        model.setOs(STATUS_OS);
        model.setOsVersion(STATUS_OS_VERSION);
        model.setMinimal(STATUS_MINIMAL);
        model.setRecommended(STATUS_RECOMMENDED);
        model.setUrl(STATUS_URL);

        return model;
    }

    public static AlertContractListModel alertContractsModel() {
        AlertContractListModel contractListModel = new AlertContractListModel();
        AlertContractModel contractModel = new AlertContractModel();
        contractModel.setAuthorized("");
        contractModel.setContractNumber(CONTRACT_NUMBER);
        contractModel.setEmail(AGENT_EMAIL);
        contractModel.setEnvironment(ENVIROMENT);
        contractModel.setInitialDate(INITIAL_DATE);
        contractModel.setLastPrintDate(LAST_PRINT_DATE);
        contractModel.setNif(TEST_COMPANY_NIF);
        contractModel.setOwner(CUSTOMER_FULLNAME);
        contractModel.setPersonNumber(PERSON_NUMBER_INT);
        contractModel.setPhone(OFFICE_PHONE);
        contractModel.setPush(PUSH);
        contractModel.setType(PUSH_TYPE);

        ArrayList<AlertContractModel> alertContracts = new ArrayList<AlertContractModel>();
        for (int i = 0; i < TEST_NUMBER_OF_ITEMS; i++) {
            alertContracts.add(contractModel);
        }
        contractListModel.setContracts(alertContracts);

        return contractListModel;
    }

    public static MailListModel mailListModel() {
        MailListModel mailListModel = new MailListModel();
        ArrayList<MailModel> mailModels = new ArrayList<MailModel>();
        for (int i = 0; i < TEST_NUMBER_OF_ITEMS; i++) {
            mailModels.add(mailModel());
        }
        mailListModel.setPaginator(paginatorModel());
        mailListModel.setMails(mailModels);

        return mailListModel;
    }

    public static MailModel mailModel() {
        MailModel mailModel = new MailModel();
        mailModel.setAccount(accountModel());
        mailModel.setCategory(MAIL_CATEGORY);
        mailModel.setContent(MAIL_CONTENT);
        mailModel.setDate(MAIL_DATE);
        mailModel.setPdfId(MAIL_PDF_ID);
        mailModel.setRead(MAIL_READ);
        mailModel.setContract(MAIL_CONTRACT);
        mailModel.setDocumentId(MAIL_DOCUMENT_ID);
        return mailModel;
    }

    public static MerchantListModel merchantsListModel() {
        MerchantListModel model = new MerchantListModel();

        ArrayList<MerchantModel> merchants = new ArrayList<MerchantModel>();
        for (int i = 0; i < TEST_NUMBER_OF_ITEMS; i++) {
            merchants.add(merchantModel());
        }
        model.setMerchants(merchants);

        return model;
    }

    public static MerchantModel merchantModel() {
        MerchantModel model = new MerchantModel();

        model.setId(MERCHANT_ID);
        model.setName(MERCHANT_NAME);

        return model;
    }

    public static TerminalListModel terminalListModel() {
        TerminalListModel model = new TerminalListModel();

        ArrayList<TerminalModel> terminals = new ArrayList<TerminalModel>();
        for (int i = 0; i < TEST_NUMBER_OF_ITEMS; i++) {
            terminals.add(terminalModel());
        }
        model.setTerminals(terminals);

        return model;
    }

    public static TerminalModel terminalModel() {
        TerminalModel model = new TerminalModel();

        model.setId(TERMINAL_ID);
        model.setType(TERMINAL_TYPE);

        return model;
    }

    public static TpvOperationListModel tpvOperationListModel() {
        TpvOperationListModel model = new TpvOperationListModel();

        ArrayList<TpvOperationModel> operations = new ArrayList<TpvOperationModel>();
        for (int i = 0; i < TEST_NUMBER_OF_ITEMS; i++) {
            operations.add(tpvOperationModel());
        }
        model.setOperations(operations);

        return model;
    }

    public static TpvOperationModel tpvOperationModel() {
        TpvOperationModel model = new TpvOperationModel();

        model.setAmount(amountModel());
        model.setDate(TEST_DATE);
        model.setHour(TEST_TIME);
        model.setMerchantCode(MERCHANT_ID);
        model.setMerchantData("");
        model.setOrder(TPV_OPERATION_ORDER);
        model.setRefund(TPV_OPERATION_REFUND);
        model.setResult(TPV_OPERATION_RESULT);
        model.setSecurePayment(TPV_OPERATION_SECURE_PAYMENT);
        KeyValueModel status = new KeyValueModel();
        status.setKey(TPV_OPERATION_STATUS_KEY);
        status.setValue(TPV_OPERATIONS_STATUS_VALUE);
        model.setStatus(status);
        model.setTerminal(TERMINAL_ID);

        return model;
    }

    // ########################################
    // Glass WebServices
    // ########################################

    public static AgentSessionModel agentSessionModel() {
        AgentSessionModel agentSessionModel = new AgentSessionModel();

        agentSessionModel.setAgent(agentModel());
        agentSessionModel.setSession(sessionModel());

        return agentSessionModel;
    }

    public static SessionModel sessionModel() {
        SessionModel sessionModel = new SessionModel();

        UserModel user = userModel();
        sessionModel.setUser(user);
        sessionModel.setInputTypeNumberSupported(true);

        return sessionModel;
    }

    public static SessionAgentAccountsModel sessionAgentAccounts() {
        SessionAgentAccountsModel sessionAgentAccountsModel = new SessionAgentAccountsModel();

        sessionAgentAccountsModel.setAgent(agentModel());
        sessionAgentAccountsModel.setAccountList(accountListModel());
        sessionAgentAccountsModel.setSession(sessionModel());

        return sessionAgentAccountsModel;
    }

    public static SessionAccountsModel sessionAccounts() {
        SessionAccountsModel sessionAccountsModel = new SessionAccountsModel();

        sessionAccountsModel.setAccountList(accountListModel());
        sessionAccountsModel.setSession(sessionModel());

        return sessionAccountsModel;
    }

    public static SessionAccountMovementsModel sessionAccountMovementModel() {
        SessionAccountMovementsModel sessionAccountMovementsModel =
                new SessionAccountMovementsModel();

        sessionAccountMovementsModel.setAccountMovementsList(accountMovementsListModel());
        sessionAccountMovementsModel.setSession(sessionModel());

        return sessionAccountMovementsModel;
    }

    public static CompanyCreditLimitsModel companyCreditLimits() {
        CompanyCreditLimitsModel limitsModel = new CompanyCreditLimitsModel();
        limitsModel.setHasCredit(false);
        limitsModel.setOperation(operationModel());
        limitsModel.setOperationGroup(operationModel());
        limitsModel.setCardUserReference(CREDIT_LIMIT_CARD_USER_REFERENCE);
        limitsModel.setCardUserId(CREDIT_LIMIT_CARD_USER_ID);
        limitsModel.setCardSituationHandle(CREDIT_LIMIT_CARD_SITUATION_HANDLE);
        limitsModel.setCardSituationValue(CREDIT_LIMIT_CARD_SITUATION_VALUE);

        return limitsModel;
    }

    public static OperationModel operationModel() {
        OperationModel operationModel = new OperationModel();
        operationModel.setCode(CREDIT_LIMIT_CODE);
        operationModel.setIdentifier(CREDIT_LIMIT_IDENTIFIER);
        operationModel.setTitle(CREDIT_LIMIT_TITLE);

        return operationModel;
    }

    public static MenuModel menuModel() {
        MenuModel menuModel = new MenuModel();
        menuModel.setOperations(menuActions());

        return menuModel;
    }

    private static List<MenuOperationModel> menuActions() {
        ArrayList<MenuOperationModel> menuActions = new ArrayList<MenuOperationModel>();
        for (int i = 0; i < TEST_NUMBER_OF_ITEMS; i++) {
            menuActions.add(menuAction());
        }
        return menuActions;
    }

    private static MenuOperationModel menuAction() {
        MenuOperationModel menuOperationModel = new MenuOperationModel();
        menuOperationModel.setTitle("");
        menuOperationModel.setAction(MENU_ACTION);
        menuOperationModel.setIcon("");
        menuOperationModel.setParams(paramsModel());

        return menuOperationModel;
    }

    public static DocumentModel companyCreditLimitsConditions() {
        DocumentModel documentModel = new DocumentModel();
        documentModel.setId("");
        documentModel.setContent("");
        documentModel.setText("");
        documentModel.setUrl(CREDIT_LIMIT_CONDITIONS_DOCUMENT_URL);
        documentModel.setName(CREDIT_LIMIT_CONDITIONS_DOCUMENT_NAME);

        return documentModel;
    }

    private static ParamsModel paramsModel() {
        ParamsModel paramsModel = new ParamsModel();
        paramsModel.setOperationBlock(MENU_ACTION_OPERATION_BLOCK);
        paramsModel.setAndroid(androidModel());
        paramsModel.setInternal(false);
        paramsModel.setRequiredLogin(false);
        paramsModel.setOperationName(MENU_ACTION_OPERATION_NAME);
        paramsModel.setUrl(MENU_ACTION_URL);

        return paramsModel;
    }

    private static AndroidModel androidModel() {
        AndroidModel androidModel = new AndroidModel();
        androidModel.setAppLaunchActivity(MENU_ACTION_APP_LAUNCH_ACTIVITY);
        androidModel.setAppLaunchActivity(MENU_ACTION_APP_LAUNCH_PACKAGE);

        return androidModel;
    }

    public static ContractListModel contractListModel() {
        ContractListModel contractListModel = new ContractListModel();
        List<ContractModel> contracts = new ArrayList<ContractModel>();
        ContractModel contractModel = contractModel();

        for (int i = 0; i < TEST_NUMBER_OF_ITEMS; i++) {
            contracts.add(contractModel);
        }
        contractListModel.setContracts(contracts);

        return contractListModel;
    }

    public static ContractModel contractModel() {
        ContractModel contractModel = new ContractModel();
        contractModel.setName(TEST_CONTRACT_NAME);
        contractModel.setNumber(TEST_CONTRACT_NUMBER);
        return contractModel;
    }

    public static BannerModel productBanner() {
        BannerModel model = new BannerModel();
        BannerOperationModel op = new BannerOperationModel();
        op.setAction(MENU_ACTION);
        op.setParams(paramsModel());
        model.setOperation(op);

        return model;
    }

    public static ProductsCardsModel productsCardsModel() {
        ProductsCardsModel model = new ProductsCardsModel();
        model.setAmount(amountModel());
        model.setCardMovement(cardMovementModel());
        model.setCards(cardsList());

        return model;
    }

    public static BannerModel walletBanner() {
        BannerModel model = new BannerModel();
        BannerOperationModel op = new BannerOperationModel();
        op.setAction(OPEN_APP);
        op.setIcon(BANNER_WALLET_ICON_URL);
        op.setParams(paramsModel());
        model.setOperation(op);

        return model;
    }

    public static NativeResponse getNativeResponse() {
        Map<String, String> headers = new HashMap<String, String>();
        headers.put(ACCEPT, ACCEPT_VALUE);
        headers.put(ACCEPT_LANGUAGE, ES_ES);

        return new NativeResponse(HTML_TO_NATIVE_REQUEST_URL, STATUS_OK, "",
                headers, "null");
    }

    // ########################################
    // Wallet WebServices
    // ########################################
    public static NfcSessionModel nfcSessionModel() {
        NfcSessionModel model = new NfcSessionModel();
        model.setOTP(TEST_WALLET_NFC_OTP);

        return model;
    }

    public static InboxesModel getInboxesModel() {
        InboxesModel inboxesModel = new InboxesModel();
        inboxesModel.setBadge(INBOXES_BADGE);
        inboxesModel.setInboxes(getInboxList());

        return inboxesModel;
    }

    public static List<InboxModel> getInboxList() {
        List<InboxModel> inboxList = new ArrayList<>();

        InboxModel inboxItem = new InboxModel();
        inboxItem.setId(INBOX_NOTIFICATION_ID);
        inboxItem.setBadge(INBOX_NOTIFICATION_BADGE);
        inboxList.add(inboxItem);

        inboxItem = new InboxModel();
        inboxItem.setId(INBOX_MAILBOX_ID);
        inboxItem.setBadge(INBOX_MAILBOX_BADGE);
        inboxList.add(inboxItem);

        inboxItem = new InboxModel();
        inboxItem.setId(INBOX_SIGNATURES_ID);
        inboxItem.setBadge(INBOX_SIGNATURES_BADGE);
        inboxList.add(inboxItem);

        inboxItem = new InboxModel();
        inboxItem.setId(INBOX_CONTRACTS_ID);
        inboxItem.setBadge(INBOX_CONTRACTS_BADGE);
        inboxList.add(inboxItem);

        return inboxList;
    }
}

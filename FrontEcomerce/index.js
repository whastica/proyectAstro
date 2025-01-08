
var WebPlatform = window.WebPlatform || {};
WebPlatform.serviceApiDomain = "service-api.app-sources.com";
WebPlatform.hash = "3cmL6GHK5/KxuB3YdjDrsIi0U6fegIF+qSo//pjgl9j99PkaF/vh5rohe26ka4LDbUaOT8HQitN/+aNo00zK2cQ5WXuWXHVbgFVKCtqH/3BoO6iurBErc5r1OkQJS0ONyYrsoNepmQ6lqFqkmwhXHgxIr11ZJ+yQXN28ehbVisi3nGuFkvF4sin5a1CZyqIt9KiNdZda02MBnm0LAfIrqj2PwnXs5oxrVPqLGbghRcspj+Pz07Iu4sYr+Nv1s5MgU9FULjqWn3zvnUDINmeAdg==";
WebPlatform.cookiesDisclaimer = ''.trim();
WebPlatform.cookiesInfoBtn = "".trim();
WebPlatform.cookiesInfoBtnLink = "".trim();
WebPlatform.cookiesAcceptBtnText = "".trim() || 'OK';

WebPlatform.dateFormat = 'dd/mm/yy';
if (!WebPlatform.onReady) {
    WebPlatform.documentReadyRequests = [];
    WebPlatform.onReady = function (request) {
    if (WebPlatform.documentReadyRequests === null)
        request();
    else
        WebPlatform.documentReadyRequests.push(request);
    };
}

if (window.disableDefaultGtagConsentModeSetup !== true) {
    window.dataLayer = window.dataLayer || [];
    window.defaultGoogleConsentState = 'granted';
    function gtag() { dataLayer.push(arguments); }
    let defaultStateValue = window.defaultGoogleConsentState || 'denied'; // or granted
    let defaultState = {
    'ad_storage': defaultStateValue,
    'ad_user_data': defaultStateValue,
    'ad_personalization': defaultStateValue,
    'analytics_storage': defaultStateValue
    };
    try {
    let savedState = localStorage.getItem('gtagConsentModeSavedState');
    if (savedState) {
        defaultState = JSON.parse(savedState) || defaultState;
    }
    } catch (ex) {
    }
    defaultState.wait_for_update = 500;
    gtag('consent', 'default', defaultState);
}

if (!WebPlatform.merge) {
    WebPlatform.merge = function (target, source) {
    for (var key in source)
        if ((typeof target[key] === "undefined") || target[key] === '')
        target[key] = source[key];
    return target;
    };
}

!function(f,b,e,v,n,t,s)
{if(f.fbq)return;n=f.fbq=function(){n.callMethod?
n.callMethod.apply(n,arguments):n.queue.push(arguments)};
if(!f._fbq)f._fbq=n;n.push=n;n.loaded=!0;n.version='2.0';
n.queue=[];t=b.createElement(e);t.async=!0;
t.src=v;s=b.getElementsByTagName(e)[0];
s.parentNode.insertBefore(t,s)}(window, document,'script',
'https://connect.facebook.net/en_US/fbevents.js');
fbq('init', '790714669679211');
fbq('track', 'PageView');

<img height="1" width="1" style="display:none" 
        src="https://www.facebook.com/tr?id=790714669679211&ev=PageView&noscript=1"/>

WebPlatform.onReady(() => {
    WebPlatform.getSessionDetails(details => {
        const root = $('#header-widget-1720423199845');
        if (details.cartSize) {
        $('.shopping-cart').removeClass('none'); // includes the mobile shopping cart!
        $('.cart-items-number').removeClass('none').text(details.cartSize); 
        }
    });
    });

WebPlatform.onReady(() => {
    WebPlatform.getSessionDetails(details => {
        const root = $('#header-widget-1720423199843');
        if (details.member) {
        root.find('a').attr('href', '/member');
        root.find('.text').text(WebPlatform.Phrases['label.profile']);
        }
    });
    });

WebPlatform.onReady(() => {
    WebPlatform.getSessionDetails(details => {
        const root = $('#header-widget-1710697643474');
        if (details.cartSize) {
        $('.shopping-cart').removeClass('none'); // includes the mobile shopping cart!
        $('.cart-items-number').removeClass('none').text(details.cartSize); 
        }
    });
    });

WebPlatform.onReady(() => {
    WebPlatform.getSessionDetails(details => {
        const root = $('#header-widget-1712533041455');
        if (details.member) {
        root.find('a').attr('href', '/member');
        root.find('.text').text(WebPlatform.Phrases['label.profile']);
        }
    });
    });

WebPlatform.onReady(() => {
    WebPlatform.getSessionDetails(details => {
        const root = $('#header-widget-1720423199843-mobile');
        if (details.member) {
        root.find('a').attr('href', '/member');
        root.find('.text').text(WebPlatform.Phrases['label.profile']);
        }
    });
    });

WebPlatform.onReady(function () {
    $('#slider-widget-1731258861025').webPlatformSlider({
        stopOnHover: true,
        showArrows: true,
        showBullets: false,
        showProgress: true,
        layerAreaStartWidth: Math.min(342, 1100),
        slideDuration: 3500,
        slideTransitionTime: 0,
        slideAnimationType: 'box-fade-random'
    });
    });

WebPlatform.onReady(function () {
    $('#slider-widget-1731175582025').webPlatformSlider({
        stopOnHover: true,
        showArrows: true,
        showBullets: true,
        showProgress: true,
        layerAreaStartWidth: Math.min(1260, 1100),
        slideDuration: 4500,
        slideTransitionTime: 0,
        slideAnimationType: 'box-fade-random'
    });
    });

WebPlatform.onReady(function () {
    $('#slider-widget-1710214007965').webPlatformSlider({
        stopOnHover: true,
        showArrows: false,
        showBullets: false,
        showProgress: false,
        layerAreaStartWidth: Math.min(1260, 1100),
        slideDuration: 1500,
        slideTransitionTime: 1100,
        slideAnimationType: 'none'
    });
    });

WebPlatform.onReady(function () {
    try {
        WebPlatform.Widgets.Store({
        maxItemsCount: WebPlatform.parse('20', 10, true),
        exclude: -1,
        root: $('#store-widget-1720424846230'),
        labelFrom: 'Desde&nbsp;',
        labelSale: 'Oferta',
        labelQuickView: 'Vista rápida',
        labelSoldOut: 'Agotado',
        baseUrl: '/store/',
        itemsPerRow: WebPlatform.parse('4', 3),
        itemGap: WebPlatform.parse('2', 0),
        showProductName: true,
        showProductPrice: true,
        hasProductQuickView: true,
        autoChangeSlides: true,
        autoChangeSlidesTimeout: WebPlatform.parse('4000', 3000),
        layout: 'carousel',
        productLayout: 'style-2',
        productAlign: 'center' || 'left',
        quickViewBtnStyle: 'quick-view-2' || 'quick-view-1',
        imageBorderRadius: 10,
        itemsType: 'latest',
        storeItems: [],
        discountBadgeType: 'text',
        storeProcess: 'cart' || 'cart',
        includeAddToCartButton: 'false' === 'true',
        imageSize: 80,
        imageSizeType: 'fit-image',
        sort: 'new',
        imageBgColor: 'transparent',
        boxBg: 'transparent',
        boxPadding: 25,
        boxRadius: 0,
        showingInventory: false,
        leftInStockThreshold: 10,
        textClass: 'bold',
        priceTextClass: '',
        shadow: ''
        });
    } catch (e) {
        Log.error(e);
    }
    });
  
window.WebPlatform = window.WebPlatform || {};
WebPlatform.Phrases = (WebPlatform.merge || window.mergeUnique)({
    'ERR_INVALID_REQUEST': 'Invalid request!',
    'label.invalid_request': "¡Solicitud no válida!",
    'client.by': "por",
    'client.on': "el",
    'client.in': "en",
    'label.of': "de",
    'client.comment': "Comentario",
    'client.comments': "Comentarios",
    'client.read_more': "Leer más",
    'client.load_more': "Cargar más",
    'label.view': "Ver",
    'label.years': "Años",
    'label.months': "Meses",
    'label.days': "Días",
    'label.minutes': "Minutos",
    'label.hours': "Horas",
    'label.seconds': "Segundos",
    'card.number': "Número de tarjeta",
    'card.cvc': "CVC",
    'card.mm': "MM",
    'card.yyyy': "AAAA",
    'card.invalid_data': "Por favor, verifica los datos de tu tarjeta de crédito/débito e inténtalo de nuevo.",
    'card.invalid_number': "El número de tarjeta no es un número válido de tarjeta de crédito o débito.",
    'card.invalid_month': "El mes de caducidad de tu tarjeta no es válido.",
    'card.invalid_year': "El año de caducidad de tu tarjeta no es válido.",
    'card.invalid_cvc': "El código de seguridad de tu tarjeta no es válido.",
    'card.unknown_error': "Por favor, verifica tus datos de pago y vuelve a intentarlo.",
    'label.shipping_address': "Dirección de envío",
    'label.billing_address': "Dirección de facturación",
    'label.january': "Enero",
    'label.february': "Febrero",
    'label.march': "Marzo",
    'label.april': "Abril",
    'label.may': "Mayo",
    'label.june': "Junio",
    'label.july': "Julio",
    'label.august': "Agosto",
    'label.september': "Septiembre",
    'label.october': "Octubre",
    'label.november': "Noviembre",
    'label.december': "Diciembre",
    'label.jan': "Ene",
    'label.feb': "Feb",
    'label.mar': "Mar",
    'label.apr': "Abr",
    'label.may_short': "Mayo",
    'label.jun': "Jun",
    'label.jul': "Jul",
    'label.aug': "Ago",
    'label.sep': "Sep",
    'label.oct': "Oct",
    'label.nov': "Nov",
    'label.dec': "Dic",
    'label.add_to_cart': "Añadir al carrito",
    'label.buy_now': "Comprar ahora",
    'label.update': "Actualizar",
    'label.change': "Cambiar",
    'label.month': "mes",
    'label.year': "año",
    'label.months_lower': "meses",
    'label.years_lower': "años",
    'label.week_lower': "semana",
    'label.weeks_lower': "semanas",
    'label.saving': "Ahorro",
    'label.checkout_now': "Pagar ahora",
    'label.view_cart': "Ver carrito",
    'label.select_product_variant': "Seleccionar variación",
    'err.select_product_variants': "Selecciona la variación para cada artículo de tu pedido",
    'label.cod': "Pago contra entrega",
    'label.bank': "Transferencia bancaria",
    'label.yes': "SÍ",
    'label.no': "NO",
    'label.enter_delivery_address': "Introduce tus datos de envío",
    'label.no_delivery_offices': "No hay oficinas disponibles",
    'label.select_speedy_office': "Seleccionar oficina de Speedy",
    'label.no_shipping_services': "Introduce la dirección",
    'label.select_delivery_type': "Selecciona el tipo de entrega",
    'label.monday_min': "L",
    'label.tuesday_min': "M",
    'label.wednesday_min': "X",
    'label.thursday_min': "J",
    'label.friday_min': "V",
    'label.saturday_min': "S",
    'label.sunday_min': "D",
    'label.monday_short': "Lun",
    'label.tuesday_short': "Mar",
    'label.wednesday_short': "Miér",
    'label.thursday_short': "Jue",
    'label.friday_short': "Vie",
    'label.saturday_short': "Sáb",
    'label.sunday_short': "Dom",
    'label.contact_booked_error': "Ya has reservado una plaza en este evento de grupo",
    'label.already_booked_time_error': "La hora seleccionada no está disponible, por favor selecciona otra hora",
    'label.booking_notice_error': "La reserva está demasiado cerca de la hora actual. Por favor, recarga la página",
    'label.delete_account_prompt': "¿Quieres eliminar tu cuenta?",
    'label.slots_left': "plazas restantes",
    'store.label.sale': "Oferta",
    'label.left_in_stock_multiple': "¡Solo quedan %x% en stock!",
    'label.left_in_stock_single': "¡Solo queda 1 en stock!",
    'label.taxes': "Impuesto:",
    'label.taxes_included': "Impuesto incluido:",
    'error.fill_required_fields': "Por favor, completa todos los campos obligatorios.",
    'label.logout': "Cerrar sesión",
    'label.subscriptions': "Suscripciones",
    'label.my_membership': "Mis membresías",
    'label.downloads': "Descargas",
    'label.order_history': "Historial de pedidos",
    'label.details': "Detalles",
    'label.address': "Dirección",
    'label.information': "Detalles",
    'label.name': "Nombre",
    'label.email': "Dirección de e-mail",
    'label.password': "Contraseña",
    'label.old_password': "Contraseña actual",
    'label.new_password': "Nueva contraseña",
    'label.repeat_password': "Repetir contraseña",
    'members.button.delete_account': "Eliminar perfil",
    'members.button.save_changes': "Guardar cambios",
    'label.saved': "¡Guardado!",
    'label.phone': "Teléfono",
    'label.optional': "opcional",
    'label.store.address': "Dirección",
    'label.store.address2': "Información adicional sobre la dirección",
    'label.store.city': "Ciudad",
    'label.store.state': "Provincia",
    'label.store.post_code': "Código postal",
    'label.store.companyId': "Núm. de identificación de empresa",
    'label.store.companyName': "Nombre de empresa",
    'label.store.use_different_billing_addr': "Utilizar una dirección de facturación diferente",
    'label.download': "Descargar",
    'label.my_subscriptions': "Mis suscripciones",
    'label.product': "Producto",
    'label.subscription_fee': "Cuota de suscripción",
    'label.last_billing_date': "Última fecha de facturación",
    'label.next_billing_date': "Próxima fecha de facturación",
    'label.order_status_canceled': "Cancelado",
    'label.order_status_completed': "Finalizado",
    'label.cancel_subscription': "Cancelar suscripción",
    'label.view_membership': "ver detalles de membresía",
    'label.cancel_subscription_desc': "¿Seguro que quieres cancelar tu suscripción?",
    'label.invoice_no': "Factura núm.",
    'label.date': "Fecha",
    'label.store.total': "Total",
    'label.status': "Estado",
    'label.no_orders_yet': "Todavía no tienes ningún pedido",
    'label.status_pending': "Pendiente",
    'label.status_shipped': "Enviado",
    'label.status_completed': "Finalizado",
    'label.status_canceled': "Cancelado",
    'label.shipping_details': "Detalles de envío",
    'label.billing_details': "Datos de facturación",
    'label.payment_details': "Datos de pago",
    'label.card': "Tarjeta de crédito",
    'label.shipping_cost': "Gastos de envío",
    'label.additional_info': "Información adicional",
    'label.discount': "Descuento",
    'label.quantity': "Cantidad",
    'label.price': "Precio",
    'store.label.subtotal': "Subtotal",
    'label.store.discount_title': "Descuento",
    'label.variation': "Variación",
    'label.profile': "Mi perfil",
    'label.order_id': "Pedido nº ",
    'label.speedy.to_address_short': "Entregar a domicilio con Speedy",
    'label.speedy.to_office_short': "Entregar a la oficina con Speedy",
    'label.minutes_short': "min."
            
}, WebPlatform.Phrases || {});

WebPlatform.Store = WebPlatform.Store || {};
        
    WebPlatform.merge(WebPlatform.Store, {
    hideUnavailableVariations: false,
    notEnoughQuantityMessage: "No hay suficiente cantidad disponible para algunos de los productos.",
    currencySymbol: "$",
    currencySymbolAtLeft: true,
    currency: 'COP',
    priceWithTax: true,
    country: 'CO',
    baseUrl: '/store',
    productAddedToCart: 'El producto se ha añadido a tu carrito',
    fbPxId: '790714669679211'
    });


        WebPlatform.clientData = null;
        WebPlatform.visitorEmail = ''; 
        WebPlatform.visitorName = '';
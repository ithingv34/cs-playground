const { description } = require('../../package')

module.exports = {
  base: '/cs-playground/',
  /**
   * Ref：https://v1.vuepress.vuejs.org/config/#title
   */
  title: 'Computer Science Playground',
  /**
   * Ref：https://v1.vuepress.vuejs.org/config/#description
   */
  description: description,

  /**
   * Extra tags to be injected to the page HTML `<head>`
   *
   * ref：https://v1.vuepress.vuejs.org/config/#head
   */
  head: [
    ['meta', { name: 'theme-color', content: '#3eaf7c' }],
    ['meta', { name: 'apple-mobile-web-app-capable', content: 'yes' }],
    ['meta', { name: 'apple-mobile-web-app-status-bar-style', content: 'black' }]
  ],

  /**
   * Theme configuration, here is the default theme configuration for VuePress.
   *
   * ref：https://v1.vuepress.vuejs.org/theme/default-theme-config.html
   */
  themeConfig: {
    repo: '',
    editLinks: false,
    docsDir: '',
    editLinkText: '',
    lastUpdated: false,
    nav: [
      {
        text: '자료구조',
        link: '/datastructure/',
      },
      {
        text: '운영체제',
        link: '/os/'
      },
      {
        text: 'Github',
        link: 'https://github.com/ithingv34/cs-playground'
      }
    ],
    sidebar: {
      '/datastructure/': [
        {
          title: '자료구조',
          collapsable: false,
          children: [
            '',
            'using-vue',
          ]
        }
      ],
    },
  },

  /**
   * Apply plugins，ref：https://v1.vuepress.vuejs.org/zh/plugin/
   */
  plugins: [
    '@vuepress/plugin-back-to-top',
    '@vuepress/plugin-medium-zoom',
  ]
}
